package com.cydeo.test.day7_TestNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InformationAlertTest extends TestBase {

    @Test
    public void informationAlertTest(){

//        2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

//        3. Click to “Click for JS Alert” button
        WebElement JSAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JSAlert.click();

//        4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

//        5. Verify “You successfully clicked an alert” text is displayed.
        WebElement text = driver.findElement(By.id("result"));
        System.out.println("text.isDisplayed() = " + text.isDisplayed());

    }

}
