package com.bharath.learning.core.threads.interruption;

class WorkerTask implements Runnable {

    @Override
    public void run() {

        while(!Thread.currentThread().isInterrupted()) {
            System.out.println("Task Thread is Working...");
           /* try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted while sleeping!");
                break; // Exit the loop if interrupted
            }*/
        }
        System.out.println("Thread is exiting gracefully.");
    }
}




public class ThreadInterruptionExample {

    public static void main(String[] args) {
        WorkerTask workerTask = new WorkerTask();
        Thread workerThread = new Thread(workerTask);

        workerThread.start();


        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is interrupting the worker thread.");
        // Runner will interrupt the below thread
        workerThread.interrupt(); // Request to interrupt the worker thread
    }
}
