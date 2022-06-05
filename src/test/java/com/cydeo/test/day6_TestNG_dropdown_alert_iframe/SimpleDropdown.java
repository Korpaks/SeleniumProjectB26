package com.cydeo.test.day6_TestNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleDropdown {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void dropdownTest(){

//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

//        3. Verify “Simple dropdown” default selected value is correct
//       Expected: “Please select an option”
        Select simpleDropdowns = new Select(driver.findElement(By.id("dropdown")));

        String actualSimpleDropdown = simpleDropdowns.getFirstSelectedOption().getText(); // gives us the first selected option that is by default
        String expectedSimpleDropdown = "Please select an option";
        Assert.assertEquals(actualSimpleDropdown, expectedSimpleDropdown);

//        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”
        Select stateDefault = new Select(driver.findElement(By.id("state")));
        String actualStateDefaultText = stateDefault.getFirstSelectedOption().getText();
        String expectedStateDefaultText = "Select a State";

        Assert.assertEquals(actualStateDefaultText, expectedStateDefaultText);

        driver.quit();
    }

}
