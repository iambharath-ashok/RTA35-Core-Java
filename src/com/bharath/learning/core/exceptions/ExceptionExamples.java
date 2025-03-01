package com.bharath.learning.core.exceptions;

import java.util.List;

class Student {

    private String name;
    private int age;
    private String address;

    // Zero Argument Constructor - Provided by Programmer
    public Student() {

    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name:: "+ name + "  ,Age:: "+ age + " ,Address:: "+ address.toUpperCase());
    }
}



public class ExceptionExamples {

    public static void main(String[] args) {
        Student student1  = new Student("Bharath", 30, "Bangalore");
        Student student3  = new Student("Daemon", 25, null);
        Student student2  = new Student("Aegon", 27, "Kings Landing");

        List<Student> students  = List.of(student1, student3, student2);


        for (Student student : students) {
            try {
                student.display();
            } catch (NullPointerException e) {
                System.out.println("Exception occurred:: "+ e.getMessage());
            }
        }




    }
}
