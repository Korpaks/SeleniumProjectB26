package com.cydeo.test.day14_javaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singletonPractice(){

        String word1 = Singleton.getWord();
        System.out.println("word1 = " + word1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);
    }

}
