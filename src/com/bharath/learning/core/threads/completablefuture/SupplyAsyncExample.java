package com.bharath.learning.core.threads.completablefuture;

import java.util.concurrent.CompletableFuture;

public class SupplyAsyncExample {

    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + ":: Hello from CompletableFuture!");
            return "Hello from supplyAsync!";
        }).thenAccept(result -> {
            System.out.println(Thread.currentThread().getName() + ":: Result from previous stage: " + result);
        }).thenRun(() -> {
            System.out.println(Thread.currentThread().getName() + ":: Final stage completed!");
        });

        // Wait for the CompletableFuture to complete
        try {
            Thread.sleep(2000); // Sleep for 2 seconds to allow async tasks to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
