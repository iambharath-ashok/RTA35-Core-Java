package com.bharath.learning.core.collections.failfastandfailsafeiterators;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> fruitList = new CopyOnWriteArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Elderberry");

        // Using fail-safe iterator
        Iterator<String> fruitIterator = fruitList.iterator();

        // Modifying the list while iterating
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
            // Modifying the list while iterating (structural modification)
            fruitList.add("Fig"); // This will not cause ConcurrentModificationException
        }

        // Adding an element after the iterator has been created
        fruitList.add("Grape"); // This will not cause ConcurrentModificationException

        // Printing the list after modification
        System.out.println("List after modification: " + fruitList);

    }
}
