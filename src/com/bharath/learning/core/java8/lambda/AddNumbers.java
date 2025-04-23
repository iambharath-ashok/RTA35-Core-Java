package com.bharath.learning.core.java8.lambda;

@FunctionalInterface
public interface AddNumbers {

    int add(int num1, int num2);
}

class AddNumbersImpl {
    public static void main(String[] args) {
        AddNumbers addNumbers = ( num1,  num2) -> {
            return num1 + num2;
        };

        int result = addNumbers.add(5, 10);

        System.out.println("Sum: " + result);

        AddNumbers addNumbers1 = (num1, num2) -> num1 + num2;

        int result1 = addNumbers1.add(5, 10);
        System.out.println("Sum: " + result1);

    }
}
