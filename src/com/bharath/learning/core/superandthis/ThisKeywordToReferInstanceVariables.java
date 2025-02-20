package com.bharath.learning.core.superandthis;

 class Student {
     private String name;
     private int age;

     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public void displayInfo() {
         System.out.println("Name: " + this.name);
         System.out.println("Age: " + this.age);
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }






public class ThisKeywordToReferInstanceVariables {

    public static void main(String[] args) {
        Student student1 = new Student("Bashok", 28);

        student1.setAge(30);
        student1.setName("Aegon");


        student1.displayInfo();
    }
}
