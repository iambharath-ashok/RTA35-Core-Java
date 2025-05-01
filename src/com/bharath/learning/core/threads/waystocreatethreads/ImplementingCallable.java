package com.bharath.learning.core.threads.waystocreatethreads;

import java.util.concurrent.*;

public class ImplementingCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> result = executorService.submit(myCallable);
        System.out.println("Callable Result: " + result.get());


    }
}


class MyCallable implements Callable<String> {

    public String call() {
        System.out.println("My Callable is running");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        return "Callable Completed";
    }
}
