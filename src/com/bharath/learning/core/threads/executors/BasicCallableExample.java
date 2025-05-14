package com.bharath.learning.core.threads.executors;

import java.util.concurrent.*;

public class BasicCallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<String> callable = () -> {
            System.out.println(Thread.currentThread().getName()+" Performing Callable Task....");// callable
            System.out.println(Thread.currentThread().getName()+" Performing DB call....");
            Thread.sleep(1000);// simulating some work
            //Simulation DB call
            System.out.println(Thread.currentThread().getName()+" Callable completed....");
            return "Callable Task Completed";
        } ;

        // Future is a placeholder for the result of the callable
        //Callable submitted to the executor service and it will run in a separate thread
        Future<String> future =  executorService.submit(callable);
        System.out.println(Thread.currentThread().getName()+":: Doing some other work....");
        //Future.get() will block the current thread until the callable is completed
        //main thread will wait for the callable to complete
        String callableReturnedValue = future.get(2000, TimeUnit.MILLISECONDS);
        System.out.println(Thread.currentThread().getName()+":: Callable returned value: "+callableReturnedValue);

        executorService.shutdown();




    }
}
