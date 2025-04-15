package com.bharath.learning.core.collections.map.hashmap;

import com.bharath.learning.core.collections.set.treeset.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapCreationExamples {


    public static void main(String[] args) {

        // HashMap is a part of the Java Collections Framework and implements the Map interface.
        // It is a hash table based implementation of the Map interface.
        // It allows null values and the null key.
        // It is not synchronized and is not thread-safe.
        // It is not guaranteed that the order of the map will remain constant over time.
        // Below are some examples of creating HashMap objects.
        Map<String, String> map = new HashMap<>();

        Map<String, Integer> map2 = new HashMap<>();

        Map<String, Student> map3 = new HashMap<>();

        Map<Integer, String> map4 = new HashMap<>();

        // Creating a HashMap with initial capacity and load factor
        Map<String, String> map5 = new HashMap<>(16, 0.75f);


    }
}
