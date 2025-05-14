package com.bharath.learning.core.threads.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureThenApply {

    public static void main(String[] args) {


       CompletableFuture<Void> completableFuture =  CompletableFuture.runAsync(() ->{
            System.out.println(Thread.currentThread().getName() + ":: Hello from CompletableFuture!");
        }).thenApplyAsync(result -> {
            System.out.println(Thread.currentThread().getName() + ":: Result from previous stage: " + result);
            return "Hello from thenApplyAsync!";
        }).thenAccept(result -> {
            System.out.println(Thread.currentThread().getName() + ":: Final result: " + result);
        });

        // Wait for the CompletableFuture to complete
        completableFuture.join();


    }
}
