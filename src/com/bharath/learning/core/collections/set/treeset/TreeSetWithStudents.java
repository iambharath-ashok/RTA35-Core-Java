package com.bharath.learning.core.collections.set.treeset;

import java.util.TreeSet;

public class TreeSetWithStudents {

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 23));

        System.out.println("TreeSet of Students: " + students);

        // Attempting to add a duplicate student
        students.add(new Student("Alice", 22));
        System.out.println("After attempting to add a duplicate: " + students);
    }
}
