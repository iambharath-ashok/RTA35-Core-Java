package com.bharath.learning.core.collections.failfastandfailsafeiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {

    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Elderberry");

        // Using fail-fast iterator
        Iterator<String> fruitIterator = fruitList.iterator();

        // Modifying the list while iterating
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
            // Modifying the list while iterating (structural modification)
            // Uncommenting the next line will cause ConcurrentModificationException
   //         fruitList.add("Fig"); // This will cause ConcurrentModificationException
        }

        fruitList.add("Grape"); // This will not cause ConcurrentModificationException


    }
}
