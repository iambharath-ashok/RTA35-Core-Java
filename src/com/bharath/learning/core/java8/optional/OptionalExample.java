package com.bharath.learning.core.java8.optional;

import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // make a DB call and get Student Details
        List<String> studentList = getStudentList();

        // check if the student list is empty
//        if (studentList.isEmpty()) {
//            System.out.println("No students found");
//        } else {
//            // print the student list
//            System.out.println("Student List: " + studentList);
//        }

        // with optional

        // make a DB call and get Student Details
        List<String> studentListOptional = getStudentList();
        Optional<List<String>> optional = Optional.ofNullable(studentListOptional);

        // check if the student list is empty

        optional.map(l -> l.stream()).stream().forEach(System.out::println);



    }

    private static List<String> getStudentList() {
        // Simulating a DB call
        return null;
    }

}
