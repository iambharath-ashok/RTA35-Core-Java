package com.bharath.learning.core.oops.polymorphism;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

}


public class MethodOverloading {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10,30);
        calculator.add(10,30, 90);
        calculator.add(49.88, 77.99);

    }
}