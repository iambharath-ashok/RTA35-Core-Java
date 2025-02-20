package com.bharath.learning.core.superandthis;

class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        super(); // Constructor Chaining b/w Parent Class and Child Class
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterized Constructor Called");
    }

    public Employee() {
        this("default name", 2000);// Constructor Chaining
        System.out.println("Zero Argument Constructor called");
    }


    public void register(Department department) {
        department.show(this);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee name:"+ this.name + ", salary: "+ this.salary);
    }

}

class Department {

    private  String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void show(Employee e) {
        System.out.println("Employee in Department:: "+ e.getName());
    }
}


public class ThisForConsturctorChaining {

    public static void main(String[] args) {
        Employee employee = new Employee("Abc", 1000);
        Employee employee2 = new Employee();
        employee.display();

        Department department = new Department("IT");
        employee.register(department);
        employee2.register(department);
    }
}
