package com.cydeo.test.day11_utilities_windows;

import com.cydeo.test.utilities.TestBase;
import com.cydeo.test.utilities.WebTableUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTable extends TestBase {

    @Test
    public void orderNameVerify(){

        //    1. Goto : https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

        //    // 2. Verify Bob’s name is listed as expected. //    Expected: “Bob Martin”
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        String actualName = bobMartinCell.getText();
        String expectedName = "Bob Martin";
        Assert.assertEquals(actualName,expectedName, "name not matching");

//    3. Verify Bob Martin’s order date is as expected
//    Expected: 12/31/2021
        WebElement bobMartinDateCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

        Assert.assertEquals(bobMartinDateCell.getText(), "12/31/2021");

        System.out.println(WebTableUtilities.returnOrderDate(driver, "Bob Martin"));


    }
}
