package com.bharath.learning.core.oops.encapsulation;

public class EncapsulationExample1 {

    public static void main(String[] args) {

        Student bharath = new Student();
        bharath.setName("Bharath");
        bharath.setAge(30);
        bharath.setRollNumber(7);

        System.out.println(bharath);

        Student hema = new Student();
        hema.setName("hema");
        hema.setAge(28);
        hema.setRollNumber(3);

        System.out.println(hema);


        Student aegon = new Student();
        aegon.setName("aegon");
        aegon.setAge(-4);
        aegon.setRollNumber(3);

        System.out.println(aegon);
    }
}


class Student {

    private String name;
    private int age;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new RuntimeException("Age should be postive integer");
        }
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
