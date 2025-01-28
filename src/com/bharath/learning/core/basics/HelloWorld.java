package com.bharath.learning.core.basics;

public class HelloWorld {


    public static void main(String [] args) {
        int counter = 10;
        counter++;
        method(counter);
    }



    public static void method(int counter) {
        System.out.println("Hello World");
        counter++;
        System.out.println("Counter Value in method 1:: "+ counter);
        method2(counter);
    }


    public static void method2(int counter) {
        System.out.println("Method 2");
        counter++;
        System.out.println("Counter Value in method 2:: "+ counter);
    }

}
