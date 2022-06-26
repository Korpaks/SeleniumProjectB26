package com.cydeo.test.day18_pom_syncronization;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadPage {

    public DynamicLoadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[.='Start']")
    public WebElement start;

    @FindBy (id = "username")
    public WebElement username;

    @FindBy (id = "pwd")
    public WebElement password;

    @FindBy (xpath = "//button[.='Submit']")
    public WebElement submit;

    @FindBy (xpath = "//div[@class='flash error']")
    public WebElement errorMessage;
}
