package com.cydeo.test.day11_utilities_windows;

import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class MulitipleWindows extends TestBase {
    @Test
    public void windowsHadleTEst(){
//        1. Create new test and make setups
//        2. Goto:https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

//        4. Create a logic to switch to the tab where Etsy.com is open
        Set <String> allWindows = driver.getWindowHandles();
        for(String each: allWindows){
            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());
            if(driver.getTitle().contains("Etsy")){
                break;
            }
        }
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        String expectedTitle = "Etsy";
        Assert.assertTrue(currentTitle.contains(expectedTitle));
//        Assert:Titlecontains“Etsy”
    }
}
