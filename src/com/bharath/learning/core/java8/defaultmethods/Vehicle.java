package com.bharath.learning.core.java8.defaultmethods;

public interface Vehicle {

    void start();
    void stop();
    void accelerate();
    void brake();

    default void fly() {
        System.out.println("Vehicle is flying");
    }

    // static methods are mainly used to define utility methods
    // static methods are not inherited by subclasses
    // static method belongs to the interface and not to the instance of the class
    // static methods can be called using the interface name
    static boolean isValidRegistration(String registration) {
        return registration != null && !registration.isEmpty();
    }
}

class Bike implements  Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Bike braked");
    }

    @Override
    public void fly() {
        System.out.println("Bike is flying");
    }

    public void validateRegistration(String registration) {
        if (Vehicle.isValidRegistration(registration)) {
            System.out.println("Valid registration");
        } else {
            System.out.println("Invalid registration");
        }
    }

}

class Train implements Vehicle {
    @Override
    public void start() {
        System.out.println("Train started");
    }

    @Override
    public void stop() {
        System.out.println("Train stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Train accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Train braked");
    }
}

class Main {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.fly();

        Train train = new Train();
        train.fly();
    }
}
