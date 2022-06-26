package com.cydeo.test.day18_pom_syncronization;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecuterScroll {

    @Test
    public void test() throws InterruptedException {
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
//        3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,750)"); // first number represent horizontal line, second number vertical line
            Thread.sleep(500);
        }

//        a.  750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,-750)");
            Thread.sleep(500);
        }
//                b.  750 pixels up 10 times
    }
}
