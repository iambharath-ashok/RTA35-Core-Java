package com.bharath.learning.core.collections.arrayproblems;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {


    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};

        Set<Integer> duplicates = new HashSet<>();

        for (int number : array) {
            if (!duplicates.add(number)) {
                System.out.println("Duplicate number: " + number);
            }

        }

    }
}
