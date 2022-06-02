package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGIntro {

    @Test
    public void test1(){
        System.out.println("Test 1 is running");
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running");
    }

}
