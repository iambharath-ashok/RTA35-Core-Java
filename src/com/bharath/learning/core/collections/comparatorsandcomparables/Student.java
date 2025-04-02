package com.bharath.learning.core.collections.comparatorsandcomparables;

public class Student implements Comparable<Student>{
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student otherStudent) {
       // return this.name.compareTo(otherStudent.name);
       // return Integer.compare(this.age, otherStudent.age);
        // return this.name.compareTo(otherStudent.name) + Integer.compare(this.age, otherStudent.age);
        return this.name.compareTo(otherStudent.name) == 0 ? Integer.compare(this.age, otherStudent.age) : this.name.compareTo(otherStudent.name);

    }
}
