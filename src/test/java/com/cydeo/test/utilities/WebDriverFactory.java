package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //     TASK: NEW METHOD CREATION
    // Method name : getDriver
    // Static method
    // Accepts String arg: browserType
    //   - This arg will determine what type of browser is opened
    //   - if "chrome" passed --> it will open chrome browser
    //   - if "firefox" passed --> it will open firefox browser
    // RETURN TYPE: "WebDriver"

        public static WebDriver getDriver(String browserType){

            WebDriver driver;

            switch (browserType.toLowerCase()){

                case  "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Unknown Browser type " + browserType);
                    driver=null;
            }
            driver.manage().window().maximize();
            return driver;
        }
}
