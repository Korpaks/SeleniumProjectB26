package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomeworkEtsy {

     public static void main(String[] args) throws InterruptedException {

//          TC: Etsy checkbox and radio button
//          1. Go to https://www.etsy.com

          WebDriver driver = WebDriverFactory.getDriver("chrome");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("https://www.etsy.com");

          //          2. Search for “wooden spoon”
          WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
          searchBox.sendKeys("wooden spoon" + Keys.ENTER);

//          3. Click on filters
          WebElement filter = driver.findElement(By.xpath("//span[@class='wt-hide-xs wt-show-md filter-expander']"));
          filter.click();

//          4. Select free shipping, on sale
          WebElement freeShipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
          freeShipping.click();
          WebElement onSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
          onSale.click();

//          5. Select under $25 Click on apply filters
          WebElement under25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
          under25.click();
          WebElement apply = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']"));
          apply.click();
          Thread.sleep(2000);
//          6. Print count of results
          WebElement result = driver.findElement(By.xpath("(//span[@class='wt-display-inline-flex-sm']//span)[1]"));
          System.out.println(result.getText());

          driver.quit();

     }
}
