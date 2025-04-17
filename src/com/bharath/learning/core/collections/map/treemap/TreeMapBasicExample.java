package com.bharath.learning.core.collections.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasicExample {

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new TreeMap<>(Comparator.reverseOrder());

        employeeMap.put(104, "Charlie Davis");
        employeeMap.put(101, "Jane Smith");
        employeeMap.put(103, "Bob Brown");
        employeeMap.put(100, "John Doe");
        employeeMap.put(102, "Alice Johnson");

        // Displaying the TreeMap
        System.out.println("Employee Map (Sorted by Key):");
        System.out.println("--------------------------------");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }




    }
}
