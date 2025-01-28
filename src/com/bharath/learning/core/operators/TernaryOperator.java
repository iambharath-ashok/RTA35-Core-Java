package com.bharath.learning.core.operators;

public class TernaryOperator {

    public static void main(String[] args) {


        int number = 1010;
        if (number % 2 == 0) {
            System.out.println("Number "+ number + " is Even");
        } else {
            System.out.println("Number "+ number + " is Odd");
        }

        boolean isOdd = number % 2 == 0 ? false : true;
        String isEvenOrOdd = number % 2 == 0 ? "Number "+ number + " is Even"  : "Number "+ number + " is Odd";

        System.out.println(isEvenOrOdd);

        //condition ? result_1 : result_2

    }
}
