package com.bharath.learning.core.collections.map.treemap;

import java.util.*;

public class StudentResultsTreeMapExample {

    public static void main(String[] args) {

        // Create a TreeMap to store student names and their scores
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        // Adding student names and scores
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 90);
        studentScores.put("Eve", 95);

        // Displaying the students and their scores in ascending order of names
        System.out.println("Student Scores (Sorted by Name):");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Displaying the students and their scores in descending order of names
        System.out.println("\nStudent Scores (Sorted by Name in Descending Order):");
        for (Map.Entry<String, Integer> entry : studentScores.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Displaying the students and their scores in descending order of scores
        System.out.println("\nStudent Scores (Sorted by Score in Descending Order):");
        Collection<Integer> scores = studentScores.values();
        List<Integer> sortedScores = new ArrayList<>(scores);
        Collections.sort(sortedScores, Collections.reverseOrder());
        System.out.println(sortedScores);

        sortStudentsByScore(studentScores);
    }


    public static Map<String, Integer> sortStudentsByScore(Map<String, Integer> studentScores) {

        // Step 1:Convert the TreeMap to a List of Map.Entry
        Set<Map.Entry<String, Integer>> studentEntries = studentScores.entrySet();

       // Step 2: Sort the List of Map.Entry by value (score) in descending order
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(studentEntries);

        // Step 3: Sort the List using a custom comparator
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Step 4: Create a LinkedHashMap to maintain the order of insertion
        Map<String, Integer> sortedStudentsByScore = new LinkedHashMap<>();

        // Step 5: Populate the LinkedHashMap with sorted entries
        for (Map.Entry<String, Integer> entry:  entryList) {
            sortedStudentsByScore.put(entry.getKey(), entry.getValue());
        }

        // Displaying the sorted students by score
        System.out.println("Students sorted by score (descending order):");
        for (Map.Entry<String, Integer> entry : sortedStudentsByScore.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Step 6: Return the sorted LinkedHashMap
        return sortedStudentsByScore;
    }
}
