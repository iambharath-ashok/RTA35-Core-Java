package com.bharath.learning.core.threads.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorServiceThreadPoolExample {

    public static void main(String[] args) {


        Executor executor = Executors.newFixedThreadPool(4);

        executor.execute(() -> System.out.println(Thread.currentThread().getName()+":: Hello from Executor!"));

        executor.execute(() -> System.out.println(Thread.currentThread().getName()+":: Task 2 from Executor!"));
        executor.execute(() -> System.out.println(Thread.currentThread().getName()+":: Task 3 from Executor!"));
        executor.execute(() -> System.out.println(Thread.currentThread().getName()+":: Task 4 from Executor!"));
        executor.execute(() -> System.out.println(Thread.currentThread().getName()+":: Task 5 from Executor!"));



    }
}
