package com.bharath.learning.core.collections.queue;

import java.util.LinkedList;

public class LinkedListAsQueue {


    public static void main(String[] args) {


        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(10);

        queue.offer(10);
        queue.offerFirst(30);
        queue.offerLast(20);
        queue.offerLast(50);
        queue.offerLast(20);
        queue.addLast(90);
        queue.addFirst(100);
        System.out.println("Queue: " + queue);

        System.out.println("Polled Element:: "+ queue.poll());;

        System.out.println("Queue after poll: " + queue);
    }
}
