package com.cydeo.test.day14_javaFaker;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if(word == null){
            System.out.println("First time calling. Word is null");
            word = "something";
        }else {
            System.out.println("Word is already assigned ad has a value");
        }
        return word;
    }


}
