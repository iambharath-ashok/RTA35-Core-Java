package com.bharath.learning.core.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+":: Task1"));
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+":: Task2"));
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+":: Task3"));
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+":: Task4"));
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+":: Task5"));
    }
}
