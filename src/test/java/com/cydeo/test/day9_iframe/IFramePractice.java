package com.cydeo.test.day9_iframe;

import com.cydeo.test.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class IFramePractice extends TestBase {

@Test
    public void test1(){
    //2- Go to: https://practice.cydeo.com/iframe
    driver.get("https://practice.cydeo.com/iframe");

    //            3- Clear text from comment body

    //frame method switch to
    driver.switchTo().frame("mce_0_ifr");
    WebElement commentBody = driver.findElement(By.id("tinymce"));

    // other way can be next
    // driver.switch().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr'])));
    //we can use frame index as well
    // driver.switchTo().frame(0)
    commentBody.clear(); // clear method deletes text from comment body

    //4- Type "Hello World" in comment body
    commentBody.sendKeys("Hello World");

    //5- Verify "Hello World" text is written in comment body
    WebElement commentBodyText = driver.findElement(By.xpath("//body[@id='tinymce']//p"));
    String actualText = commentBodyText.getText();
    String expectedText = "Hello World";
    Assert.assertEquals(actualText, expectedText, "Text not matching");

    //6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
    driver.switchTo().parentFrame();
    WebElement headerText = driver.findElement(By.tagName("h3"));
    assertTrue(headerText.isDisplayed(), "Header text not displayed");

    String actualHeader = headerText.getText();
    String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

    assertEquals(actualHeader, expectedHeader, "Header not correct");


}

}
