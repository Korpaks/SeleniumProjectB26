package com.cydeo.test.day7_TestNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework extends TestBase {

    @Test
    public void test1() throws InterruptedException {

//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

//        3. Select “December 1st, 1923” and verify it is selected.

        Select year = new Select(driver.findElement(By.id("year")));
//        Select year using   : visible text
        year.selectByVisibleText("1923");

//        Select month using    : value attribute Select
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("11");

//        day using : index number
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByIndex(0);

        Thread.sleep(3000);

        String actualYear = year.getFirstSelectedOption().getText();
        String expectedYear = "1923";
        Assert.assertEquals(actualYear, expectedYear, "year not matching");

        String actualMonth = month.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth, expectedMonth, "month not matching");

        String actualDay = day.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay, expectedDay, "day not matching");

    }
}
