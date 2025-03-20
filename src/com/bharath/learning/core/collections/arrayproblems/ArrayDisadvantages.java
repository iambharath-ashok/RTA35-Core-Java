package com.bharath.learning.core.collections.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDisadvantages {

    public static void main(String[] args) {


        int array[] = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("Array:: "+ Arrays.toString(array)); // This will print 0

       // array[7]  =10; // This will throw ArrayIndexOutOfBoundsException

        array = new int[10];
        System.out.println("Array:: "+ Arrays.toString(array)); // This will print 0




        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        


        System.out.println("List:: "+ list);

        for (int i = 0; i < 55; i++) {
            list.add(i);
        }

        System.out.println("List:: "+ list);
    }
}
