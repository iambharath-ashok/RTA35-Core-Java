package com.bharath.learning.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DPvsIP {

    public static void main(String[] args) {

        // Fetch employee salaries from DB
        List<Double> salaries = Arrays.asList(1000.0, 2000.0, 3000.0, 4000.0, 5000.0);

        // Calculate the average salary using imperative programming
        List<Double> updatedSalaries = new ArrayList<>();

        for (Double salary : salaries) {
            updatedSalaries.add(salary * 1.1);
        }
        System.out.println("Updated Salaries (Imperative): " + updatedSalaries);

        // Calculate the average salary using declarative programming or functional programming
        List<Double> updatedSalariesWithDP = salaries.stream()
                .map(salary -> salary * 1.1)
                .collect(Collectors.toList());
        System.out.println("Updated Salaries (Declarative): " + updatedSalariesWithDP);
    }
}
