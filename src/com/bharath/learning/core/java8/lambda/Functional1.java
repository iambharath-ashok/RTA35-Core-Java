package com.bharath.learning.core.java8.lambda;

interface NonFunctional1 {
    void add();

    void subtract();
}

@FunctionalInterface
public interface Functional1 extends NonFunctional1 {
    void add();

    default void subtract() {
        System.out.println("Subtracting in default method");
    }
}




