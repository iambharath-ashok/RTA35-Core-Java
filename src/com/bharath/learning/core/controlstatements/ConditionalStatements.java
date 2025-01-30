package com.bharath.learning.core.controlstatements;

public class ConditionalStatements {


    public static void main(String[] args) {

        System.out.println("Main method started");

        ifElseStatement();
        System.out.println("Main method ended");
    }


    private static void ifElseStatement() {
        System.out.println("entering ifElseStatement");
        int age = 10;
        String name = new String("Bharath");

        if (age >= 18 && name.equalsIgnoreCase("Bharath") ) {
            System.out.println("Bharath, you are an adult");
        } else if (age >= 21) {
            System.out.println("You are an adult");
        } else if (!name.equalsIgnoreCase("Bharath")) {
            System.out.println("you are not bharath");
        } else {
            System.out.println("you are Minor");
        }

        System.out.println("exiting from ifElseStatement");
    }
}
