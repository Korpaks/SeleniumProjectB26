package com.cydeo.test.day3_locators;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task04cssSelector {
//    TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes 3- Verify “Reset password” button text is as expected:
//    Expected: Reset password

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("cHrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement text = driver.findElement(By.cssSelector("button[class='login-btn']"));
        String resetPassText = text.getText();

        if(resetPassText.equals("Reset password")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        driver.quit();



    }

}
