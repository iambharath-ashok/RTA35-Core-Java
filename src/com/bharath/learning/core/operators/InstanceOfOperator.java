package com.bharath.learning.core.operators;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class InstanceOfOperator {

    public static void main(String[] args) {

        Integer data = 10;
        String name = "Bharath";


        if (data instanceof Integer) {
            System.out.println("data is of type Integer");
        }

        if (name instanceof String) {
            System.out.println("name is of type string");
        }


        Person person1 = new Employee();
        Person person2 = new Student();
        Person person3 = new Scientist();
        Person person4 = new Student();
        Person person5 = new Employee();

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);


        for (Person person : personList) {
            if (person instanceof Student) {
                System.out.println("Apply the scheme");
            }
        }





    }
}

class Person { }

class Student extends Person {}

class Employee extends Person {}

class Scientist extends Person {}
