package com.bharath.learning.core.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringNumbersWithStreamAPI {

    public static void main(String[] args) {

        // source of data is list of numbers
        List<Integer> scores = Arrays.asList(55, 99, 75, 60,86);

        List<Integer> firstClassScores = scores.stream()
                .filter(score -> score >= 60) // filter the scores greater than or equal to 60
                .toList();

        // print the filtered list
        System.out.println("First Class Scores: " + firstClassScores);
    }
}
