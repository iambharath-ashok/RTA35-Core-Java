package com.bharath.learning.core.oops.encapsulation;

import java.time.LocalDate;

public class Person {

    //properties, attributes, data
    private int age;
    private String name;
    private LocalDate dob;

    //Methods, behaviours

    public void sing() {

    }


    public void program() {}


    public void startEngine() {
        Engine engine = new Engine();
        engine.start();
    }

}
