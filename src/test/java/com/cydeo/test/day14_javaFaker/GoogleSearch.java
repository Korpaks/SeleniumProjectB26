package com.cydeo.test.day14_javaFaker;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearch {

    @Test
    public void googleSearch(){
        Driver.getDriver().get("https://www.google.com/");

        WebElement searchBox = Driver.getDriver().findElement(By.tagName("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);
    }
}
