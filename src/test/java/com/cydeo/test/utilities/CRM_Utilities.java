package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities extends TestBase{

    public static void login_crm(WebDriver driver){
        WebElement emailBox = driver.findElement(By.name("USER_LOGIN"));
        emailBox.sendKeys("helpdesk9@cybertekschool.com");
        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();
    }

    public static void login_crm(WebDriver driver, String username, String password){
        WebElement emailBox = driver.findElement(By.name("USER_LOGIN"));
        emailBox.sendKeys(username);
        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys(password);
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();
    }
}
