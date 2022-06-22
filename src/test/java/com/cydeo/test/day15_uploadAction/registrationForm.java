package com.cydeo.test.day15_uploadAction;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registrationForm {

    @Test
    public void test(){

     //    Note: Use JavaFaker OR read from configuration.properties file when possible.

//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registrationFormURL"));
//    3. Enter first name
        Faker faker = new Faker();
        WebElement firstName = Driver.getDriver().findElement(By.name("firstname"));
        firstName.sendKeys(faker.name().firstName());
//    4. Enter last name
        WebElement lastName = Driver.getDriver().findElement(By.name("lastname"));
        lastName.sendKeys(faker.name().lastName());
//    5. Enter username
        WebElement userName = Driver.getDriver().findElement(By.name("username"));
        userName.sendKeys(faker.name().username());
//    6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());
//    7. Enter password
        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys(faker.internet().password());
//    8. Enter phone number```
        WebElement phoneNumber = Driver.getDriver().findElement(By.name("phone"));
        phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
//    9. Select a gender from radio buttons
        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        gender.click();
//    10.Enter date of birth
        WebElement DOB = Driver.getDriver().findElement(By.name("birthday"));
        DOB.sendKeys(faker.date().birthday().toString());
//    11.Select Department/Office
        Select select = new Select(Driver.getDriver().findElement(By.name("department")));
        select.selectByVisibleText("Mayor's Office");
//    12.Select Job Title
        Select select1 = new Select(Driver.getDriver().findElement(By.name("job_title")));
        select1.selectByVisibleText("SDET");
//    13.Select programming language from checkboxes
        WebElement checkbox = Driver.getDriver().findElement(By.id("inlineCheckbox2"));
        checkbox.click();
//    14.Click to sign up button
        WebElement signUp = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUp.click();
//    15.Verify success message “You’ve successfully completed registration.” is
//    displayed.
        WebElement result = Driver.getDriver().findElement(By.tagName("p"));
        String actualText =  result.getText();
        String expectedText = "You’ve successfully completed registration.";

        Assert.assertEquals(actualText,expectedText);
    }
}
