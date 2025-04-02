package com.bharath.learning.core.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        Collections.reverse(fruits);


        System.out.println("Fruits list after reversing: " + fruits);

    }
}
