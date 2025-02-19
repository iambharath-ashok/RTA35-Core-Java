package com.bharath.learning.core.oops.constructors;


class Car {

    //Default Constructor


    private String brand;
    private int speed;
    private double price;
    private long something;
    private float engineCapacity;

    public void display() {
        System.out.println("Brand:: "+ brand + " Speed:: "+ speed + " "+ price + " "+ something + " " + engineCapacity);
    }

}


public class DefaultConstructorsExamples {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display();
    }
}
