package com.cydeo.test.day15_uploadAction;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverOverPractice {

    @Test
    public void test() throws InterruptedException {

        //    1. Go to https://www.google.com/
        Driver.getDriver().get("https://www.google.com/");
//    2. Hover over on Search button
        Actions actions = new Actions(Driver.getDriver());
        WebElement searchBtn = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLuckyBtn = Driver.getDriver().findElement(By.id("gbqfbb"));

        // hover over method is moveToElement()
        Thread.sleep(3000);
        actions.moveToElement(searchBtn).perform();
        Thread.sleep(3000);
        actions.moveToElement(feelingLuckyBtn).perform();

//    3. Hover over on Feeling Lucky button
    }
}
