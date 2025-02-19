package com.bharath.learning.core.oops.classes;

public class Car {

    // Attributes

    // Private files (Encapsulation)
    private String brand; // No accessible outside this class
    private int speed;


    protected String steeringWheel;


    // Constructor
    public Car (String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    // Methods or Behaviours


    public void accelerate(int increase) {
        speed += increase;
        System.out.println(this.brand   + " acceralted to "+ this.speed + "km /h");

    }


    public void brake(int decrease) {
        speed -= decrease;
        System.out.println(this.brand   + " slowed down to "+ this.speed + "km /h");

    }

}

class Benz extends Car {

    public Benz(String brand, int speed) {
        super(brand, speed);
    }


}


class Main {

    public static void main(String[] args) {
        int counter = 10;

        // Creating object of the Car class

        Car benz = new Car("Benz", 100);
        Car bmw = new Car("BMW", 130);
        Car toyota = new Car("Toyota", 90);


        // Using the Objects

        // Calling the Behaviours of Object


        bmw.accelerate(49);

        benz.brake(10);



        Benz benz1 = new Benz("Benz",120);

        benz1.accelerate(90);
        benz1.brake(10);






    }
}