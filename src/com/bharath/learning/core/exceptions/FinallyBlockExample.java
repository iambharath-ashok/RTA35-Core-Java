package com.bharath.learning.core.exceptions;

public class FinallyBlockExample {


    public static void main(String[] args) {

        // Finally block will execute no matter exception is thrown or not
        // Finally block is executed even if there is a return statement in try block
        // Finally block is executed even if there is a return statement in catch block
        // Finally block is mainly used to close resources like file, database connections etc.
        // Finally block can be used without catch block as well
        try {
            int num = 10;
            int divisor = 5;
            int result = num / divisor;
           // System.exit(0);
            return;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed");
            return;
        } finally {
            System.out.println("Finally block is executed");
        }



    }
}
