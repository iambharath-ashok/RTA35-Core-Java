package com.bharath.learning.core.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSorting {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        list.add(50);//3

        System.out.println("List before sorting: " + list);

        // Sorting the list
        list.sort(Comparator.reverseOrder());

        // Another way to sort the list
       //  Collections.sort(list, Comparator.reverseOrder());


        System.out.println("List after sorting: " + list);



    }
}
