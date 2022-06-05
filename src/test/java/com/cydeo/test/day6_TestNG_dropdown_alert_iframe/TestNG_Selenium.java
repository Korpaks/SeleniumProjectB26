package com.cydeo.test.day6_TestNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Selenium{

    @Test
    public void googleTitle(){
        //set up chrome and create WebDriver
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // Get "https://google.com/"
        driver.get("https://google.com/");

        // Assert: title is  "Google"
       String actualResult = driver.getTitle();
       String expectedResult = "Google";

        Assert.assertEquals(actualResult,expectedResult, "title not matching");

        driver.quit();

    }

}
