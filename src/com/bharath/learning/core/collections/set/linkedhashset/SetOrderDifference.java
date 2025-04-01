package com.bharath.learning.core.collections.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetOrderDifference {

    public static void main(String[] args) {

        // HashSet does not guarantee the order of elements
        // LinkedHashSet maintains the insertion order
        // TreeSet sorts the elements in natural order or according to a comparator

        // Example usage
        System.out.println("HashSet does not maintain order");
        System.out.println("LinkedHashSet maintains insertion order");
        System.out.println("TreeSet sorts elements in natural order");


        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Grapes");


        // LinkedHashSet example
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Grapes");

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
