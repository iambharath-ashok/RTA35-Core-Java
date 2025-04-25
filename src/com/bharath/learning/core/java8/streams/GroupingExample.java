package com.bharath.learning.core.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Fruit {

    private String name;
    private int count;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public Fruit(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}




public class GroupingExample {

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 10);
        Fruit banana = new Fruit("Banana", 20);
        Fruit orange = new Fruit("Orange", 30);
        Fruit apple2 = new Fruit("Apple", 15);
        Fruit banana2 = new Fruit("Banana", 25);
        Fruit cherry = new Fruit("Cherry", 5);
        Fruit dates = new Fruit("Dates", 8);
        Fruit dates2 = new Fruit("Dates", 18);


        List<Fruit> fruits = List.of(apple, banana, orange, apple2, banana2, cherry, dates, dates2);

        Map<String, List<Fruit>> collect = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName));

        System.out.println("Grouped Fruits: " + collect);

        Map<String, Long> collect1 = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
        System.out.println("Grouped Fruits with count: " + collect1);

        Map<String, Integer> collect2 = fruits.stream()
                .collect(Collectors.groupingBy(f -> f.getName(),
                        Collectors.summingInt(f -> f.getCount())));

        System.out.println("Grouped Fruits with sum: " + collect2);



    }
}
