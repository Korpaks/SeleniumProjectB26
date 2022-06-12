package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandle extends TestBase {
    @Test
    public void windowsHandleTest() {

//        2. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

        String mainWindow = driver.getWindowHandle();

//        3. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

//        4. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

//        5. Switch to new Window.
        Set<String> allWindows = driver.getWindowHandles();
        for(String each : allWindows){
            driver.switchTo().window(each);
            System.out.println(driver.getTitle());
        }
//        6. Assert: Title is “New Window”
        String ExpectedTitleAfter = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitleAfter, actualTitle);

}
}
