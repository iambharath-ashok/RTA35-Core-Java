package com.bharath.learning.core.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTraversal {

    public static void main(String[] args) {

        List<String> techs = new ArrayList<>();
        techs.add("Java");
        techs.add("Python");
        techs.add("Go");
        techs.add("React");

        // traditional for loop
        for (int i = 0; i < techs.size(); i++) {
            System.out.print(techs.get(i)+",");
        }

        System.out.println("\n");
        // enhanced for loop
        for (String tech : techs) {
            System.out.print(tech+",");
        }
        System.out.println("\n");
        // Iterator
        System.out.println("Iterator can be used to traverse in forward direction only");
        Iterator<String> techsIterator = techs.iterator();
        while (techsIterator.hasNext()) {
            System.out.print(techsIterator.next()+",");
        }

        // ListIterator
        ListIterator<String> techsListIterator = techs.listIterator();
        System.out.println("List Iterator can be used to traverse in both forward and backward direction");
        System.out.println("Backward Traversal");
        while (techsListIterator.hasPrevious()) {
            System.out.println(techsListIterator.previous());
        }

        System.out.println("Forward Traversal");
        while (techsListIterator.hasNext()) {
            System.out.println(techsListIterator.next());
        }

        System.out.println("Backward Traversal");
        while (techsListIterator.hasPrevious()) {
            System.out.println(techsListIterator.previous());
        }

        // forEach (java 8 feature)
        System.out.println("forEach method in List interface");
        techs.forEach(tech -> System.out.print(tech+","));

        // stream (java 8 feature)
        System.out.println("\nstream method in List interface");
        techs.stream().forEach(tech -> System.out.print(tech+","));


    }
}
