package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        //    1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //     2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com");

        Thread.sleep(4000);

        //     3- Click to A/B Testing from top of the list.
        WebElement abLink = driver.findElement(By.linkText("A/B Testing"));
        abLink.click();

        //      4- Verify title is:
        //    Expected: No A/B Test
        String actualTitle = driver.getTitle();
        String expectedTitle = "No A/B Test";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        Thread.sleep(4000);

        //      5- Go back to home page by using the .back();
        driver.navigate().back();
        //      6- Verify title equals:
        //    Expected: Practice
         actualTitle = driver.getTitle();
         expectedTitle = "Practice";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        Thread.sleep(4000);
        driver.quit();

    }

}
