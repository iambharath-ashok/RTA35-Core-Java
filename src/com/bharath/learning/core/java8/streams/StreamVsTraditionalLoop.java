package com.bharath.learning.core.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamVsTraditionalLoop {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("bharath", "Aeagon", "Danaerys", "Daemon", "Arya");

        // Traditional for loop
        // Using a traditional for loop to filter names starting with 'A'
        // Imperative approach
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                filteredNames.add(name);
            }
        }

        // functional way of doing the same
        // Using Stream API to filter names starting with 'A'
        List<String> filteredNamesFunctionalWay  = filteredNames.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

    }
}
