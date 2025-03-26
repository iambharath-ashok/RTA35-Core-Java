package com.bharath.learning.core.collections.linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasicMethods {

    public static void main(String[] args) {
        // circular buffer what the trade off b/w LL vs     1p  AL

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        list.addFirst(30);

        System.out.println(list);

        Deque<Integer> deque = new LinkedList<>();

        deque.offer(10);
        deque.offer(10);
        deque.offer(10);
        deque.offer(10);

        deque.offerFirst(20);
        deque.offerLast(30);

        System.out.println(deque);




    }
}
