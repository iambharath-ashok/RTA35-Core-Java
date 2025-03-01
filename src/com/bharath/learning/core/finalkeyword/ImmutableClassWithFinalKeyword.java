package com.bharath.learning.core.finalkeyword;

// Immutable class
// 1. Make the class final so that it cannot be extended or subclassed
// 2. Make the instance variables private and final so that they cannot be modified
// 3. Provide only getter methods for the instance variables
// 4. Do not provide setter methods
// 5. Do not provide any methods that can change the state of the object
final class ImmutableClass {


    private final int id;
    private final String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}





public class ImmutableClassWithFinalKeyword {

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(1, "Bharath");
        System.out.println("Id: " + immutableClass.getId());
        System.out.println("Name: " + immutableClass.getName());

        // immutableClass.id = 2; // Compilation Error: cannot assign a value to final variable id
    }
}
