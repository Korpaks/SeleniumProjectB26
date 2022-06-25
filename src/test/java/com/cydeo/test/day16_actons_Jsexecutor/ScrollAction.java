package com.cydeo.test.day16_actons_Jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollAction {

    @Test
    public void test(){
        //    1- Open a chrome browser
//    2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoPractice"));
        Actions actions = new Actions(Driver.getDriver());

//    3- Scroll down to “Powered by CYDEO”
        WebElement cydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));

//    4- Scroll using Actions class “moveTo(element)” method
        actions.moveToElement(cydeo).perform();

//    1- Continue from where the Task 4 is left in the same test.
//    2- Scroll back up to “Home” link using PageUP button
        WebElement home = Driver.getDriver().findElement(By.linkText("Home"));
        actions.sendKeys(home, Keys.PAGE_UP).perform(); // another way would be actions.moveToElement(home).perform();
    }
}
