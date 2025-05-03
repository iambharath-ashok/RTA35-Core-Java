package com.bharath.learning.core.threads.synchronization;

// This is a simple example of an unsynchronized class
//common shared class as resource

class CounterWithOutSynchronization {
     int count = 0;

    public void increment() {
        count++;
    }
}

class CounterWithSynchronization {
    int count = 0;

    public void increment() {
        // This method is synchronized to prevent concurrent access
        synchronized (this) {
            count++;
        }
    }
}

public class UnsynchronizedExample {


    public static void main(String[] args) {
        // Create a shared resource
        // Below shared resource is passed to multiple threads
        // Below shared resource is not synchronized
        CounterWithSynchronization counter = new CounterWithSynchronization();

        // Create multiple threads that will access the shared resource
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);
        CounterThread thread3 = new CounterThread(counter);


        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        //The expected output is 3000
        System.out.println("Final count: " + counter.count);

    }
}


class CounterThread extends Thread {
    private CounterWithSynchronization counter;

    public CounterThread(CounterWithSynchronization counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000;i++) {
            counter.increment();
        }
    }

    public int getCount() {
        return counter.count;
    }
}
