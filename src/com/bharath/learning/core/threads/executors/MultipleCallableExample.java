package com.bharath.learning.core.threads.executors;

import java.util.List;
import java.util.concurrent.*;

public class MultipleCallableExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Below is how we will initialize the executor service and create a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Callable<String>> tasks = List.of(
                () -> "Task 1 Result",
                () -> "Task 2 Result",
                () -> "Task 3 Result",
                () -> "Task 4 Result"
        );

        List<Future<String>> futureResults = executorService.invokeAll(tasks);
        for (Future<String> future : futureResults) {
                String result = future.get();
                System.out.println("Result: " + result);
        }

        executorService.shutdown();
    }
}
