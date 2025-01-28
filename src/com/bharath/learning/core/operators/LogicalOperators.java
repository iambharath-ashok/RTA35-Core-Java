package com.bharath.learning.core.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // &&, ||, !

        int a = 10, b = 50;

        System.out.println("Logical And::" + (a > 10 && b > 10));
        System.out.println("Logical OR::" + (a > 10 || b > 10));
        System.out.println("Logical NOT::" + !(b > a));


        boolean isTrue = true;
        boolean isFalse = false;


        boolean logicalAnd = isTrue && isFalse; // Logical AND (false)
        boolean logicalOr = isTrue || isFalse; // Logical OR (true)
        boolean logicalNot = !isFalse; // Logical Not (true)


        System.out.println("Logical AND:: "+ logicalAnd);
        System.out.println("Logical OR:: "+ logicalOr);
        System.out.println("Logical NOT:: "+ logicalNot);









    }
}
