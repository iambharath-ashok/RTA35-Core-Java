package com.bharath.learning.core.collections.set.treeset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        // TreeSet is a part of the Java Collections Framework and implements the Set interface.
        // It is a NavigableSet that uses a Red-Black tree structure to store elements in sorted order.
        // It does not allow duplicate elements and provides guaranteed log(n) time cost for basic operations like add, remove, and contains.

        // Example usage
        System.out.println("TreeSet is a part of the Java Collections Framework and implements the Set interface.");
        System.out.println("It is a NavigableSet that uses a Red-Black tree structure to store elements in sorted order.");
        System.out.println("It does not allow duplicate elements and provides guaranteed log(n) time cost for basic operations like add, remove, and contains.");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(99);
        hashSet.add(100);
        hashSet.add(3);
        hashSet.add(669);
        hashSet.add(1);
        hashSet.add(20);


        // HashSet does not guarantee the order of elements
        System.out.println("HashSet: " + hashSet);

        // TreeSet sorts the elements in natural order
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(99);
        treeSet.add(100);
        treeSet.add(3);
        treeSet.add(669);
        treeSet.add(1);
        treeSet.add(20);

        System.out.println("TreeSet: " + treeSet);







    }
}
