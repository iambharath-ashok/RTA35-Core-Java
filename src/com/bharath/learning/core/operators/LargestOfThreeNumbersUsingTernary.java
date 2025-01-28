package com.bharath.learning.core.operators;

public class LargestOfThreeNumbersUsingTernary {

    public static void main(String[] args) {

        int num1 = 50, num2 = 5, num3 = 30;

        int result = num1 + num2 + num3/5 * (10 * num2);

        int largestOfThree = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;
        System.out.println(largestOfThree);
    }
}
