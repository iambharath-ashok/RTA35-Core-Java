package com.bharath.learning.core.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasicOperations {

    public static void main(String[] args) {

        // Creating an ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Java");
        list.add("React");
        list.add("Go Lang");
        list.add("Angular");


        // Getting element by index
        System.out.println("Element at index 3: " + list.get(3));

        // Updating element by index
        try {
            list.set(4, "vue.js");
        } catch (RuntimeException e) {
            System.out.println("Exception " + e.getMessage());
        }

        // try to get element by index which is not present
        try {
            System.out.println("Element at index 5: " + list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception");
        }

        // Getting size of list
        System.out.println("Size of list: " + list.size());

        // Removing element by index
        try {
            list.remove(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception");
        }


        // Display the final list
        System.out.println("Final list: " + list);
    }
}
