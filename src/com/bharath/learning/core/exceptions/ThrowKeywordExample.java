package com.bharath.learning.core.exceptions;

import java.io.FileNotFoundException;

public class ThrowKeywordExample {

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
