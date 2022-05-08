package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

       // driver.get("https://etsy.com");

        // make our page fullscreen
        Thread.sleep(3000);

        driver.manage().window().maximize();

        driver.navigate().to("https://etsy.com");

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();


        String currentTitle = driver.getTitle();
        System.out.println("Etsy page " + currentTitle);

        driver.get("https://tesla.com");

        String currentTitle1 = driver.getTitle();
        System.out.println("Tesla page " + currentTitle1);

        String currentURL = driver.getCurrentUrl();
        System.out.println("Tesla web page " + currentURL);
        // close current tab
        driver.close();
        // close all tabs
        driver.quit();







    }
}
