package com.bharath.learning.core.java8;


import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface FruitsFunctionalInterface {

    int fruitCount(String str, int count);
}


class Main {
    public static void main(String[] args) {

        // Fruits is source of data, (List or Collection will source of data)
        List<String> fruits = Arrays.asList("Apple", "Banana",
                "Cherry", "Date", "Elderberry");

        // Using a lambda expression to implement the functional interface
        FruitsFunctionalInterface fruitLengthLambda =  (str, count) -> {
           int stringLength = str.length();
           int fruitCount = count * 10;
            System.out.println("Fruit: " + str + ", Length: " + stringLength + ", Count: " + fruitCount);
            return fruitCount;
        };


        fruits.stream().map(fruit -> fruitLengthLambda.fruitCount(fruit, 10))
                .forEach(System.out::println);


//
//
//        for (String fruit : fruits) {
//            int count = fruitLengthLambda.fruitCount(fruit, 10);
//            System.out.println("Fruit: " + fruit + ", Count: " + count);
//
//        }








      /*  for (String fruit : fruits) {
            System.out.println(fruit.length());
        }*/







    }
}