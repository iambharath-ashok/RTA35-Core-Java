package com.bharath.learning.core.statickeyword;

class Employee {

    private String name;
    private int age;
    private long id;

    public Employee(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void display() {
        System.out.println("===================================");
        System.out.println("Employee Details");
        System.out.println("Name:: "+ name + " Age:: "+ age + " Id:: "+ id);
        Department department = new Department("IT", "Bangalore", 123);
    }

    // Static Nested Class behaves like a normal class but it is declared inside another class
    // Static Nested Class can access only static members of the outer class
    // Static method can access only static members of the class - same applies to static nested class
    // Static Nested Class can be accessed using outer class name
    // Static Nested is just like static variables
    // We have private, protected, public static nested classes like we used to have for static variables

    public static class Department {
        private String departmentName;
        private String location;
        private long departmentId;

        public Department(String departmentName, String location, long departmentId) {
            this.departmentName = departmentName;
            this.location = location;
            this.departmentId = departmentId;
        }

        public void displayDepartment() {
            System.out.println("===================================");
            System.out.println("Department Details");
            System.out.println("Department Name:: "+ departmentName + " Location:: "+ location + " Department Id:: "+ departmentId);
        }

    }


}



public class StaticNestedClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Bharath", 30, 12345);
        employee.display();

        // Accessing non-static nested class
       // Employee.Department department = employee.new Department("IT", "Bangalore", 123);

        // Accessing static nested class
        Employee.Department department = new Employee.Department("IT", "Bangalore", 123);
        department.displayDepartment();
    }
}
