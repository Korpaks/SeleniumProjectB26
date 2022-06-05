package com.cydeo.test.day6_TestNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StateDropDown extends TestBase {

    @Test
    public void stateDropDownTest(){
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select stateDropDown = new Select(driver.findElement(By.id("state")));

        //3. Select Illinois
        stateDropDown.selectByValue("CA");

        //4. Select Virginia
        stateDropDown.selectByVisibleText("Virginia");

        //5. Select California
        stateDropDown.selectByIndex(5);

        //6. Verify
//    final selected option is California.
//    Use all Select options. (visible text, value, index)
        String actualResult = stateDropDown.getFirstSelectedOption().getText();
        String expectedResult = "California";

        Assert.assertEquals(actualResult,expectedResult, "not matching option selected");
    }

    @Test
    public void mulitpleDropDown(){
//        3. Select all the options from multiple select dropdown.

        Select language = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        System.out.println("language.isMultiple() = " + language.isMultiple());

        language.selectByValue("java");
        language.selectByVisibleText("C#");
        language.selectByIndex(3);

//        4. Print out all selected values.

        for(WebElement each : language.getOptions()){
            each.click();
            System.out.println("each.getText() = " + each.getText());
        }

        //            5. Deselect all values.
        language.deselectAll();

    }

}
