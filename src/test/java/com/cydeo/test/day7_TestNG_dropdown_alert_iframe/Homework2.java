package com.cydeo.test.day7_TestNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework2 extends TestBase {

    @Test
    public void test1(){

//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

//        3. Click to non-select dropdown
        WebElement nonSelectDrop = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        nonSelectDrop.click();

//        4. Select Facebook from dropdown
        WebElement facebookDrop = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebookDrop.click();

//        5. Verify title is “Facebook - log in or sign up”
        String actualResult = driver.getTitle();
        String expectedResult = "Facebook - log in or sign up";
        Assert.assertEquals(actualResult, expectedResult, "Title not matching");

    }

}
