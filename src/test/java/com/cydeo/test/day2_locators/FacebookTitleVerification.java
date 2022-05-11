package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {

    public static void main(String[] args) {

//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to https://www.facebook.com/
        driver.get("https://www.facebook.com");

//        3. Verify title:
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";

//        Expected: “Facebook - log in or sign up”
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

//        4. Close the browser
        driver.quit();

 }
}
