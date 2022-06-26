package com.cydeo.test.day18_pom_syncronization;

import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoading {

    @Test
    public void test(){

        //    1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

//            2. Click to start
        DynamicLoadPage loadPage = new DynamicLoadPage();
        loadPage.start.click();

//3. Wait until loading bar disappears
        BrowserUtils.waitForVisibilityOf(loadPage.username);
//4. Assert username inputbox is displayed
        Assert.assertTrue(loadPage.username.isDisplayed());
//5. Enter username: tomsmith
        loadPage.username.sendKeys("tomsmith");
//6. Enter password: incorrectpassword
        loadPage.password.sendKeys("incorrectpassword");
//7. Click to Submit button
        loadPage.submit.click();
//8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(loadPage.errorMessage.isDisplayed());

    }

}
