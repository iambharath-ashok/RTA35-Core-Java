package com.bharath.learning.core.oops.inheritance;

// Parent class (Level 1)
class Vehicle {

    void drive() {
        System.out.println("Vehicle is moving");
    }
}

// Intermediate class (Leve 2)
class Car extends Vehicle {

    void music() {
        System.out.println("Music is playing in car");
    }
}

// Child class (Level 3)
class ElectricCar extends Car {

    void charging() {
        System.out.println("Electric Car is Charging");
    }

}



public class MultiLevelInheritance {
    public static void main(String[] args) {


        Vehicle electricCar = new ElectricCar();
        electricCar.drive();
      //  electricCar.charging();

        if (electricCar instanceof ElectricCar) {
            ((ElectricCar) electricCar).music();
            ((ElectricCar) electricCar).charging();
        }


    }
}