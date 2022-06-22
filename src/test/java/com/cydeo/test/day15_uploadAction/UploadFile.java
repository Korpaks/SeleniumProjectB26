package com.cydeo.test.day15_uploadAction;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFile {

    @Test
    public void test() throws InterruptedException {

        //    1. Go to “http://demo.guru99.com/test/upload”
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

//    2. Upload file into Choose File
        String path = "C:\\Users\\igork\\OneDrive\\Desktop\\some-file.txt";
        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys(path);

//    3. Click terms of service checkbox
        WebElement terms = Driver.getDriver().findElement(By.id("terms"));
        terms.click();
//    4. Click Submit File button
        WebElement submit = Driver.getDriver().findElement(By.id("submitbutton"));
        submit.click();
//    5. Verify expected message appeared.
//    Expected: “1 file
//    has been successfully uploaded.”
        WebElement text = Driver.getDriver().findElement(By.xpath("(//center)[2]"));
        String actualText = text.getText();
        String expcetedText = "1 file \nhas been successfully uploaded.";
        Thread.sleep(4000);
        Assert.assertEquals(actualText, expcetedText);

        Driver.closeDriver();

    }
}
