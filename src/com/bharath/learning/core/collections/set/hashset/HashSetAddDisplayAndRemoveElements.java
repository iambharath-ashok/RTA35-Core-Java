package com.bharath.learning.core.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddDisplayAndRemoveElements {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println(fruits);


        fruits.remove("Apple");

        System.out.println(fruits);
        System.out.println(fruits.contains("Banana"));



    }
}
