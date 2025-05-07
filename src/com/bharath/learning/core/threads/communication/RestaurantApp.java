package com.bharath.learning.core.threads.communication;

import java.util.LinkedList;
import java.util.Queue;

class RestaurantOrderQueue{

    private final Queue<String> orderQueue = new LinkedList<>();
    private final int MAX_CAPACITY = 5;

    public synchronized void placeOrder(String order) throws InterruptedException {

        while (orderQueue.size() == MAX_CAPACITY) {
            System.out.println(Thread.currentThread().getName() + " waiting. " +
                    "Order queue is full. Waiting for an order to be processed...");
            this.wait();// wait for a Chef to process an order
            // wait until space is available in the queue
        }

        orderQueue.add(order);
        System.out.println(Thread.currentThread().getName() + " placed order: " + order);
        this.notifyAll();// notify the Chefs
    }

    public synchronized String cookOrder() throws InterruptedException {

       while (orderQueue.isEmpty()) {
           System.out.println("Chef waiting: no orders to process.");
              this.wait(); // wait for an order to be placed
       }

       String order = orderQueue.poll();
        System.out.println(Thread.currentThread().getName() + " processed order: " + order);
        this.notifyAll(); // notify the waiters that some space is available
        return order;
    }
}

class Waiter implements Runnable {
    private final RestaurantOrderQueue orderQueue;
    private final String [] customerOrders;

    public Waiter(RestaurantOrderQueue orderQueue, String [] customerOrders) {
        this.orderQueue = orderQueue;
        this.customerOrders = customerOrders;
    }

    @Override
    public void run() {

        for (String order: customerOrders) {
            try {
                orderQueue.placeOrder(order);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Waiter interrupted: " + e.getMessage());
            }

        }
    }
}


class Chef implements Runnable{
    private final RestaurantOrderQueue orderQueue;

    public Chef(RestaurantOrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String order = orderQueue.cookOrder();
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " cooked order: " + order);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Chef interrupted: " + e.getMessage());
            }
        }
    }
}

public class RestaurantApp {
    public static void main(String[] args) throws InterruptedException {

        RestaurantOrderQueue orderQueue = new RestaurantOrderQueue();

        String [] customerOrders = {"Pizza", "Burger", "Pasta", "Salad", "Sushi", "Tacos"};

        Thread chefThread = new Thread(new Chef(orderQueue), "Chef");
        Thread waiterThread1 = new Thread(new Waiter(orderQueue, customerOrders), "Waiter-1");
        Thread waiterThread2 = new Thread(new Waiter(orderQueue, customerOrders), "Waiter-2");
        Thread waiterThread3 = new Thread(new Waiter(orderQueue, customerOrders), "Waiter-3");

        chefThread.start();
        waiterThread1.start();
        Thread.sleep(100);
        waiterThread2.start();
        Thread.sleep(100);
        waiterThread3.start();

    }
}
