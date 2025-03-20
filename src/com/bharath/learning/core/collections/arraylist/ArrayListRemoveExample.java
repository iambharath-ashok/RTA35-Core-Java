package com.bharath.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        list.add(50);//3


        // Remove element by valid index
        list.remove(2);

        System.out.println("List after removing element at index 2: " + list);

        // Remove element by invalid index
        try {
            list.remove(9);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }


        // Remove element by object
        list.remove(Integer.valueOf(20));

        System.out.println("List after removing element 20: " + list.toString());


        // Remove all elements
        list.clear();

        System.out.println("List after clearing all elements: " + list);

    }
}
