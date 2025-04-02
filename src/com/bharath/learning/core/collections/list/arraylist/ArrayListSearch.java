package com.bharath.learning.core.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {

        List<String> cites = new ArrayList<>();

        cites.add("New York");
        cites.add("Dubai");
        cites.add("Bangalore");

        // Search for an element
        // Check if city is present in the list
        System.out.println("Is Bangalore present in the list: " + cites.contains("Bangalore"));

        // Check if city is not present in the list
        System.out.println("Is London present in the list: " + cites.contains("London"));

        // Search for an element by index
        System.out.println("Index of Dubai: " + cites.indexOf("Dubai"));

        // Check if list is empty or not
        System.out.println("Is list empty: " + cites.isEmpty());

    }
}
