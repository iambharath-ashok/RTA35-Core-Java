package com.bharath.learning.core.collections.comparatorsandcomparables;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student("John Doe", 20);
        // Create another Student object
        Student anotherStudent = new Student("Jane Doe", 22);

        TreeSet<Student> students = new TreeSet<>();
        students.add(student);
        students.add(anotherStudent);
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 23));
        students.add(new Student("Alice", 22));

        System.out.println("TreeSet of Students: " + students);

    }
}
