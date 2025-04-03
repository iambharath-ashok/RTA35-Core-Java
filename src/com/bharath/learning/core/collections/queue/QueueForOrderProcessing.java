package com.bharath.learning.core.collections.queue;

import java.util.ArrayDeque;

public class QueueForOrderProcessing {

    public static void main(String[] args) {

        ArrayDeque<String> orderQueue = new ArrayDeque<>();

        orderQueue.add("Order #001");
        orderQueue.add("Order #002");
        orderQueue.add("Order #003");
        orderQueue.offer("Order #004");

        while (!orderQueue.isEmpty()) {
            String order = orderQueue.poll(); // Retrieves and removes the head of the queue
            System.out.println("Processing " + order);
        }



    }
}
