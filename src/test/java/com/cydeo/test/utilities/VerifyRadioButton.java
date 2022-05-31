package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRadioButton {

    /* Create a utility method to handle above logic.
        Method name: clickAndVerifyRadioButton
        Return type: void or boolean
        Method args:
        1. WebDriver
        2. Name attribute as String (for providing which group of radio buttons)
        3. Id attribute as String (for providing which radio button to be clicked)

        Method should loop through the given group of radio buttons. When it finds the
        matching option, it should click and verify option is Selected.
                Print out verification: true

        */

    public static boolean clickAndVerifyRadioButton (WebDriver driver, String nameAttr, String IdAttr){

        if(driver.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver1 = new ChromeDriver();
        }
    return true;
    }
}
