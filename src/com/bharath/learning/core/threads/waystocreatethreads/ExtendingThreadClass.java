package com.bharath.learning.core.threads.waystocreatethreads;

public class ExtendingThreadClass {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("MyThread");
        myThread.start(); // Start the thread
        // Note: This will not start a new thread, it will just call the run method in the main thread.
        // To start a new thread, use myThread.start();
        System.out.println("Thread Name: " + Thread.currentThread().getName());

    }
}


class MyThread extends Thread {

    // Constructor to set the thread name
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("My Thread is running");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

/*@Override
    public void start() {
        System.out.println("Starting thread: " + getName());
        System.out.println("Executing start method");
    start0();
    }*/

   // private native void start0();
}


