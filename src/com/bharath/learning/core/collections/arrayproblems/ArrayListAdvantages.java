package com.bharath.learning.core.collections.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAdvantages {

    public static void main(String[] args) {


        // ArrayList is a part of Java Collection Framework
        // ArrayList is a resizable array
        // ArrayList can contain duplicate elements
        // ArrayList maintains insertion order
        // ArrayList allows random access because it stores elements in an index-based system
        // ArrayList is not synchronized
        // ArrayList can contain null elements
        // ArrayList is slower than a normal array
        // ArrayList is not type-safe
        // ArrayList is not thread-safe
        // ArrayList is not recommended for multi-threaded applications

        int arry[] = new int[5];

        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        arry[3] = 4;
        arry[4] = 5;

        System.out.println("Array:: "+ Arrays.toString(arry));



        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 550; i++) {

           list.add(i);

        }

        System.out.println("List:: "+ list);


        list.remove(30);
        System.out.println("List:: "+ list);

        System.out.println(list.contains(700));//returns true or false
        System.out.println(list.contains(7));//returns true or false

    }
}
