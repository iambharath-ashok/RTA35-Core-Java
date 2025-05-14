package com.bharath.learning.core.threads.completablefuture;

import java.util.concurrent.CompletableFuture;

public class SimpleCompletableFuture {

    public static void main(String[] args) {

       CompletableFuture<Void> cpmFuture = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + ":: Hello from CompletableFuture!");
        });

       /// System.out.println("Main method finished");
        // Wait for the CompletableFuture to complete
       // cpmFuture.join();


    }
}
