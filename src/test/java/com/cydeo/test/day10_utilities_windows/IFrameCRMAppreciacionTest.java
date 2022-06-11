package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.utilities.CRM_Utilities;
import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class IFrameCRMAppreciacionTest extends TestBase {

    @Test
    public void  sendingAppreciacionMsg() throws InterruptedException {

//        2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");

//        3- Login Homepage ( Login with valid username and password)
        CRM_Utilities.login_crm(driver, "helpdesk9@cybertekschool.com", "UserUser");

//        4- Click the MORE tab and select APPRECIATION
        WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-text']"));
        moreTab.click();
        WebElement appreciation = driver.findElement(By.xpath("(//span[.='Appreciation'])[1]"));
        appreciation.click();

//        5- Write an Appreciation message
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        WebElement msgBox = driver.findElement(By.xpath("//body[@contenteditable=\"true\"]"));
        msgBox.sendKeys("Gibboni");

//        6- Click the SEND button
        driver.switchTo().parentFrame();
//        WebElement send = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
//        send.click();

//        7- Verify the Appreciation message is displayed on
//        the feed
        List<WebElement> messages = driver.findElements(By.xpath("//div[@class='feed-post-text-block-inner-inner']"));
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfAllElements(messages));
        List <String> list = new ArrayList<>();
        for(WebElement each : messages){
            list.add(each.getText());
        }
        String ourActualMessage = "";
        for (String each: list) {
            if(each.contains("Gibboni")){
                ourActualMessage = each;
            }
        }
        System.out.println(list);
        String expectedMessage = "Gibboni";
        Assert.assertEquals(ourActualMessage,expectedMessage, "Message not equal");


    }
}
