package com.bharath.learning.core.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingNumbersWithStreamAPI {

    public static void main(String[] args) {

        // source of data is list of numbers
        List<Integer> numbers = Arrays.asList(55, 99, 75, 60);


        // Sorting numbers in descending order
        // using stream API
        // stream() method is used to create a stream from the list
        Stream<Integer> integerStream = numbers.stream();

        // sorted() method is used to sort the stream
        Stream<Integer> sortedIntegerStream = integerStream
                .sorted();

        // collect() method is used to collect the stream into a list
        List<Integer> sortedList = sortedIntegerStream
                .collect(Collectors.toList());


        List<Integer> collect = numbers.stream()
                .sorted(Comparator.reverseOrder()) // sorting in descending order
                .toList();

        // print the sorted list
        System.out.println("Sorted List: " + collect);

    }
}
