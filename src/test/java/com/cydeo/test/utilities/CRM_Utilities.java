package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void login_crm(){
        Driver.getDriver().get(ConfigurationReader.getProperty("envCRM"));
        WebElement emailBox =  Driver.getDriver().findElement(By.name("USER_LOGIN"));
        emailBox.sendKeys(ConfigurationReader.getProperty("usernameCRM"));
        WebElement passwordBox =  Driver.getDriver().findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("passwordCRM"));
        WebElement loginButton =  Driver.getDriver().findElement(By.className("login-btn"));
        loginButton.click();
    }

    public static void login_crm(WebDriver driver, String username, String password){
        WebElement emailBox = Driver.getDriver().findElement(By.name("USER_LOGIN"));
        emailBox.sendKeys(username);
        WebElement passwordBox = Driver.getDriver().findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys(password);
        WebElement loginButton = Driver.getDriver().findElement(By.className("login-btn"));
        loginButton.click();
    }
}
