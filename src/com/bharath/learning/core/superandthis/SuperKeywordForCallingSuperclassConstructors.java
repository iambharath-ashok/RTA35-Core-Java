package com.bharath.learning.core.superandthis;


class Vehicle {

    public String name;

    public Vehicle(String name) {
        this.name = name;
        System.out.println("Parent Constructor Called");
    }
}

class Car extends Vehicle {

    public String brand;
    public String model;

    public Car(String brand, String model) {
        super(brand); // Calls Parent Class Vehicle Constructor
        this.brand = brand;
        this.model = model;

    }

    public void display() {
        System.out.println("Car Name :: "+ super.name);
        System.out.println("Car details:: Brand: "+ this.brand + " Model: "+ this.model);
    }

}



public class SuperKeywordForCallingSuperclassConstructors {

    public static void main(String[] args) {

        Car car = new Car("Benz", "2025");
        car.display();


    }
}
