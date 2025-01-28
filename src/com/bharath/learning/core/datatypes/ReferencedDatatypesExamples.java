package com.bharath.learning.core.datatypes;

public class ReferencedDatatypesExamples {


    public static void main(String[] args) {

        int count = 10;
        // Classes or Objects
       Person roopa = new Person("Aegon", 41);
        System.out.println("Name:: " + roopa.getName());
        System.out.println("Age:: " + roopa.getAge());

        //Arrays
        int [] numbers = new int[] {1,2,3,4,5,6,7};
        int [] numbers2 = {10,30,50,80};

        System.out.println("Numbers lenght:: "+ numbers.length);
        System.out.println("First Element:: "+ numbers[5]);


        // String
        String greetings = "Hello World";
        System.out.println("Message:: "+ greetings);

        String [] names = {"aegon", "dany", "tyrion"};

    }

}


class Person {

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
