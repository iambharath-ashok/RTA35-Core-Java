package com.bharath.learning.core.threads.executors;

import java.util.concurrent.Executor;

public class SimpleExecutorExample {

    public static void main(String[] args) {


        Executor executor = command -> new Thread(command).start();
        // This is a simple implementation of Executor interface
        // Below is simple task
        executor.execute(() -> System.out.println("Hello from Executor!"));


    }

    public void execute(Runnable command) {
        new Thread(command).start();

    }
}
