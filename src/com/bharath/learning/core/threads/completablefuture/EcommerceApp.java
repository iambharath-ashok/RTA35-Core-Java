package com.bharath.learning.core.threads.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EcommerceApp {

    public static void main(String[] args) {

        ExecutorService dbExecutor = Executors.newFixedThreadPool(4);
        ExecutorService discountExecutor = Executors.newFixedThreadPool(4);
        ExecutorService notificationExecutor = Executors.newFixedThreadPool(4);


        CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching user details from DB:: " + Thread.currentThread().getName());
            simulateDelay(2000);
            return new Order("123", "user1", 100);
        }, dbExecutor)

                .thenApplyAsync((order) -> {
                    System.out.println("Apply discount:: " + Thread.currentThread().getName());
                    simulateDelay(900);
                    order.applyDiscount(10);
                    return order;
                }, discountExecutor)

                .thenAcceptAsync(order -> {
                    System.out.println("Sending Notification:: " + Thread.currentThread().getName());
                    simulateDelay(500);
                    System.out.println("Notification sent for order: " + order.getOrderId() + " with amount: " + order.getAmount());
                }, notificationExecutor)

                .join();


        dbExecutor.shutdown();
        discountExecutor.shutdown();
        notificationExecutor.shutdown();


    }
    private static void simulateDelay(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Order {
    private String orderId;
    private String userId;
    private double amount;

    public Order(String orderId, String userId, double amount) {
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public void applyDiscount(int i) {
        System.out.println("Applying discount:: " + Thread.currentThread().getName());
        this.amount = this.amount - (this.amount * i / 100);
    }
}
