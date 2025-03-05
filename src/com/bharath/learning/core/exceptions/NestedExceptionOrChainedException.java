package com.bharath.learning.core.exceptions;

public class NestedExceptionOrChainedException {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception occurred"+ e.getMessage());
            System.out.println("Cause of the Exception: "+ e.getCause().getMessage());
        }


    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            // Throwing chained or nested Exception
            // Re-throwing the Exception occurred in method2
            // Wrapping the Exception occurred in method2 with new Exception
            System.out.println("Exception occurred in method1");
            throw new Exception("Exception occurred in method1", e);
        }
    }


    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception e) {
            // Throwing chained or nested Exception
            // Re-throwing the Exception occurred in method3
            // Wrapping the Exception occurred in method3 with new Exception
            throw new Exception("Exception occurred in method2", e);
        }
    }

    // Since this method is throwing checked Exception, we need to declare it in the method signature using throws keyword
    // If we don't declare with throws keyword, we will get compilation error
    // Its mandatory to declare checked Exception in the method signature if the method is throwing checked Exception
    // Checked Exception is also called as Compile time Exception
    // If the method is throwing unchecked or Runtime Exception, then we don't need to declare it in the method signature
    public static void method3() throws Exception {
        System.out.println("Processing something very secrete in method3");
        System.out.println("Exception occurred in method3");
        // Throwing checked Exception
        throw new Exception("Exception occurred in method3");
    }
}
