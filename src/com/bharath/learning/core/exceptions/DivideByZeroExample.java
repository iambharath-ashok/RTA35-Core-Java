package com.bharath.learning.core.exceptions;

public class DivideByZeroExample {

    public static void main(String[] args) {

        int num = 10;
        int divisor = 0;

        try {
            int result = num / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed");
        }

    }
}
