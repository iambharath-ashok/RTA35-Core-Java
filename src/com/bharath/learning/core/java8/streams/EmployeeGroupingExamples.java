package com.bharath.learning.core.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeGroupingExamples {


    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "HR", 50000, 30, "New York");
        Employee emp2 = new Employee("Jane", "IT", 60000, 25, "Los Angeles");
        Employee emp3 = new Employee("Mike", "Finance", 70000, 35, "Chicago");
        Employee emp4 = new Employee("Sara", "IT", 80000, 28, "San Francisco");
        Employee emp5 = new Employee("Tom", "HR", 55000, 32, "New York");


        List<Employee> employeeList = List.of(emp1, emp2, emp3, emp4, emp5);

        // Grouping employees by department
        System.out.println("Group employee by department");
        Map<String, List<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(collect);


        // Grouping employees by department and counting the number of employees in each department
        System.out.println("Group employee by department and count");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);

        // Group employee by city and then by department
        System.out.println("Group employee by city and then by department");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.groupingBy(Employee::getDepartment))).entrySet()
                .stream().forEach(System.out::println);


        // Group by department and get the highest salary in each department
        // first group by deparment
        // then get the max salary in each department
        // compare the salary of each employee

        Map<String, Optional<Employee>> highestPaidEmployeeByDept = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

        System.out.println("Group by department and get the highest salary in each department");
        highestPaidEmployeeByDept.entrySet().stream()
                .forEach(entry -> {
                    String department = entry.getKey();
                    Optional<Employee> employee = entry.getValue();
                    System.out.println("Department: " + department + ", Highest Paid Employee: " + employee);
                });


        // Group by department and get the average salary in each department

        Map<String, Double> avgSalaryByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary)));

        System.out.println("Group by department and get the average salary in each department");
        avgSalaryByDept.entrySet().stream()
                .forEach(entry -> {
                    String department = entry.getKey();
                    Double averageSalary = entry.getValue();
                    System.out.println("Department: " + department + ", Average Salary: " + averageSalary);
                });


    }

}



class Employee {
    private String name;
    private String department;
    private int salary;
    private int age;
    private String city;

    public Employee(String name, String department, int salary, int age, String city) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
