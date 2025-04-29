package com.bharath.learning.core.java8.optional;

import java.util.Optional;

public class SimpleOptionalExampls {

    public static void main(String[] args) {

        String name = "bharath";

        Optional<String> nameOptional = Optional.ofNullable("bharath");

        System.out.println(nameOptional);
        nameOptional.map(s -> s.toUpperCase()).ifPresent(System.out::println);

        Optional<String> nameOptional2 = Optional.ofNullable(null);
        System.out.println(nameOptional2);


        Vehicle vehicle = new Vehicle("car", "vehicle");
        Optional<Vehicle> vehicleOptional = Optional.ofNullable(vehicle);

        System.out.println(vehicleOptional);

       Optional<String> filteredOptional = nameOptional.filter(s -> s.length() > 9);
        System.out.println(filteredOptional);
    }
}


class Vehicle {
    private String name;
    private String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
