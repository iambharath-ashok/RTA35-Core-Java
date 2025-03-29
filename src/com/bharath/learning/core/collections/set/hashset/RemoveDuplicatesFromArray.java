package com.bharath.learning.core.collections.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println("Array with Duplicates: "+ Arrays.toString(arr));
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : arr) {
            System.out.println("Number: " + number + " Bucket Address:: "+ (number % 16));
            uniqueNumbers.add(number);

        }

        System.out.println("Unique Numbers: " + uniqueNumbers);


    }
}
