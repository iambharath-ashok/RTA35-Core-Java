package com.bharath.learning.core.java8.streams;

import java.util.List;

public class UppercasingNamesWithStreamAPI {

    public static void main(String[] args) {

        List<String> names = List.of("bharath", "kumar", "rahul", "deepa", "hema", "Aegon the conquerer", "arya", "sansa", "jaqen", "aegon the unworthy");

        // Convert all names to uppercase using stream API

        List<String> upperCasedNames = names.stream()
                .map(name -> name.toUpperCase()) // map is used to convert each name to uppercase
                .toList(); // map is used to transform the data

        // Print the uppercased names
        System.out.println("Uppercased Names: " + upperCasedNames);


        long count = names.stream()
                .filter(name -> name.startsWith("a") || name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .filter(name -> name.length() > 7)// map is used to convert each name to uppercase
                .count();// filter the names starting with 'a'

        System.out.println("Count of names starting with 'a': " + count);
    }
}
