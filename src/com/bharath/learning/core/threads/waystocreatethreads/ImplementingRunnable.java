package com.bharath.learning.core.threads.waystocreatethreads;

import java.io.Serializable;

public class ImplementingRunnable {


    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "MyRunnableThread");
        thread.start();
    }

}



class MyRunnable implements Runnable, Cloneable, Serializable {


    @Override
    public void run() {
        System.out.println("My Runnable is running");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}