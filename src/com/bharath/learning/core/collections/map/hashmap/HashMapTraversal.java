package com.bharath.learning.core.collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTraversal {

    public static void main(String[] args) {

        Map<String , Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("apple", 10);
        fruitsMap.put("banana", 20);
        fruitsMap.put("orange", 30);
        fruitsMap.put("grape", 40);

        // Traversing the HashMap using entrySet()
        System.out.println("Traversing using entrySet():");
        for (Map.Entry<String, Integer> fruitEntry : fruitsMap.entrySet()) {
            System.out.println(fruitEntry.getKey() + " => " + fruitEntry.getValue());
        }

        // Traversing the HashMap using keySet()
        System.out.println("\nTraversing using keySet():");
        for (String fruitName : fruitsMap.keySet()) {
            System.out.println(fruitName);
        }

        // Traversing the HashMap using values()
        System.out.println("\nTraversing using values():");
        for (Integer fruitCount : fruitsMap.values()) {
            System.out.println(fruitCount);
        }

        // Traversing the HashMap using forEach() method (Java 8 and above)
        System.out.println("\nTraversing using forEach():");
        fruitsMap.forEach((fruitName, fruitCount) -> {
            System.out.println(fruitName + " => " + fruitCount);
        });

        // Traversing the HashMap using Iterator
        System.out.println("\nTraversing using Iterator:");
        Iterator<Map.Entry<String, Integer>> entryIterator = fruitsMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
