package com.bharath.learning.core.collections.comparatorsandcomparables;

import java.util.Comparator;
import java.util.TreeSet;

public class MainWithComparator {

    public static void main(String[] args) {

        Comparator<Student> studentAgeComparator = Comparator.comparingInt(Student::getAge);
        Comparator<Student> studentNameComparator = Comparator.comparing(Student::getName);

        Student student = new Student("John Doe", 20);
        // Create another Student object
        Student anotherStudent = new Student("Jane Doe", 22);

        TreeSet<Student> students = new TreeSet<>(studentNameComparator);
        students.add(student);
        students.add(anotherStudent);
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 23));
        students.add(new Student("Alice", 22));

        System.out.println("TreeSet of Students: " + students);


    }
}
