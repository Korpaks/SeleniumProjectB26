package com.cydeo.test.day16_actons_Jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecutorScroll {

    @Test
    public void test() throws InterruptedException {
//     Goto Etsy homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
//     Scroll down
        WebElement email = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", email);

//        Generate random email and enter into subscribe box
        Faker faker = new Faker();

        email.sendKeys(faker.internet().emailAddress());
//        Click on Subscribe
        WebElement subscribe = Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[2]"));
        subscribe.click();
//     Verify "Great! We've sent you an email to confirm your subscription." is displayed
        WebElement message = Driver.getDriver().findElement(By.xpath("(//div[@role='alert'])[6]"));
        Thread.sleep(2000);
        Assert.assertTrue(message.isDisplayed());
        Driver.closeDriver();

    }
}
