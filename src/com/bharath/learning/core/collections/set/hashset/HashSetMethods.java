package com.bharath.learning.core.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethods {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);

        set.add(20);
        set.add(30);

        System.out.println(set);
    }
}
