package com.bharath.learning.core.collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTraversal {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Porsche");


        for(String car: cars) {
            System.out.println(car);
        }

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        cars.forEach(System.out::println);


        cars.stream().forEach(System.out::println);
    }
}
