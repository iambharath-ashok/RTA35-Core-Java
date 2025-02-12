package com.bharath.learning.core.oops.associations;


// Example of Composition
class Engine {

    void start() {
        System.out.println("Engine Started");
    }

}

class Car {

    Engine engine;

    public  Car (Engine engine) {
        this.engine = new Engine();
    }

    public void startCar() {
        this.engine.start();
        System.out.println("Car Started");
    }

}



public class CompositionStrongAssociation {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car(engine);
        car.startCar();

    }

}
