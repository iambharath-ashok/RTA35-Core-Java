package com.bharath.learning.core.threads.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ParallelTaskExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
           simulateDelay(1000);
            System.out.println(Thread.currentThread().getName() + ":: Task 1");
            return "Data from Task 1";
        });

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            simulateDelay(3000);
            System.out.println(Thread.currentThread().getName() + ":: Task 2");
            return "Data from Task 2";
        });

        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000);
            System.out.println(Thread.currentThread().getName() + ":: Task 3");
            return "Data from Task 3";
        });

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2, task3);
        allTasks.join();

        System.out.println("All tasks completed!");
        System.out.println("Result from Task 1: " + task1.get());
        System.out.println("Result from Task 2: " + task2.get());
        System.out.println("Result from Task 3: " + task3.get());

        ;

    }

    private static void simulateDelay(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
