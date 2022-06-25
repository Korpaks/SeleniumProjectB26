package com.cydeo.test.day16_actons_Jsexecutor;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void test() throws InterruptedException {
        //    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
      Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("ccpa-consent-notice")));
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.cssSelector(".close-icon.material-icons.mat-icon-button.mat-button-base")).click();

        Driver.getDriver().switchTo().defaultContent();
//    3- Drag “BANK” and drop into Account area under Debit Side
        Actions actions = new Actions(Driver.getDriver());

        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        actions.dragAndDrop(bank, Driver.getDriver().findElement(By.id("bank"))).perform();
        Thread.sleep(1000);
//    4- Drag “5000” and drop into Amount area under Debit Side
        WebElement five000 = Driver.getDriver().findElement(By.xpath("//li[@data-id='2']"));
        actions.dragAndDrop(five000, Driver.getDriver().findElement(By.id("amt7"))).perform();
        Thread.sleep(1000);
//    5- Drag “SALES” and drop into Account area under Credit Side
        WebElement sales = Driver.getDriver().findElement(By.id("credit1"));
        actions.dragAndDrop(sales, Driver.getDriver().findElement(By.id("loan"))).perform();
        Thread.sleep(1000);
//    6- Drag “5000” and drop into Amount area under Credit Side
        WebElement fiveHundred = Driver.getDriver().findElement(By.id("fourth"));
        actions.dragAndDrop(fiveHundred, Driver.getDriver().findElement(By.id("amt8"))).perform();
//    7- Verify “Perfect!” text displayed.
        WebElement perfect = Driver.getDriver().findElement(By.linkText("Perfect!"));

        Assert.assertTrue(perfect.getText().equals("Perfect!"));
        Driver.closeDriver();

    }
}
