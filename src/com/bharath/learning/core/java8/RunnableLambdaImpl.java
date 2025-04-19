package com.bharath.learning.core.java8;

public class RunnableLambdaImpl {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Hello from a lambda expression!");
        };
        Thread thread = new Thread(runnable);
        thread.start();

        new Thread(() -> {
            System.out.println("Hell will break loose");
        }).start();
    }
}
