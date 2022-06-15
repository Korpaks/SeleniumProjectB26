package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtilities {

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    public static String returnOrderDate (WebDriver driver, String costumerName){
        WebElement costumerNameOrderDate = driver.findElement(By.xpath("//table/tbody/tr/td[.='"+costumerName+"']/following-sibling::*[3]"));
        return costumerNameOrderDate.getText();
    }

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){

        String locator = "//td[.='" + customerName + "']//following-sibling::[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        String actualOrderDate = customerDateCell.getText();
        Assert.assertEquals(actualOrderDate, expectedOrderDate);
    }

}
