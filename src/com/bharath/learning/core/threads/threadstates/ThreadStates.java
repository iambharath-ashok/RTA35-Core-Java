package com.bharath.learning.core.threads.threadstates;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" :: Thread is in Running state");
        try {
            Thread.sleep(5000); // Simulating some work
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" :: Thread is in Blocked state");
        }
        System.out.println(Thread.currentThread().getName()+" :: Thread has completed its work");
    }
}


public class ThreadStates {

    public static void main(String[] args) {
        // New State
        Task task = new Task();
        Thread thread = new Thread(task, "MyTaskThread-1");

        System.out.println("Thread State:: " + thread.getState()); // NEW

        // Start the thread
        thread.start();
        System.out.println("Thread State:: " + thread.getState()); // RUNNABLE

        try {
            // Sleep for a while to allow the thread to run
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread State:: " + thread.getState()); // RUNNABLE or TIMED_WAITING

        // Wait for the thread to finish
        try {
            thread.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread State:: is it Terminated? " + thread.getState()); // TERMINATED
    }
}
