package com.bharath.learning.core.collections.queue;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class TaskSchedulerWithPriorityBlockingQueue {

    public static void main(String[] args) {

        PriorityBlockingQueue<PriorityTask> taskQueue = new PriorityBlockingQueue<>();

        for (int i = 0; i < 2; i++) {
            TaskWorker taskWorker = new TaskWorker(taskQueue);
            Thread workerThread = new Thread(taskWorker);
            workerThread.start();

        }

        for (int i =0; i < 10; i++) {
            taskQueue.offer(new PriorityTask("Low Priority Task", TaskPriority.LOW));
            taskQueue.offer(new PriorityTask("High Priority Task", TaskPriority.HIGH));
            taskQueue.offer(new PriorityTask("Medium Priority Task", TaskPriority.MEDIUM));
            taskQueue.offer(new PriorityTask("Low Priority Task", TaskPriority.LOW));
            taskQueue.offer(new PriorityTask("High Priority Task", TaskPriority.HIGH));
            taskQueue.offer(new PriorityTask("Critical Priority Task", TaskPriority.CRITICAL));
            taskQueue.offer(new PriorityTask("Critical Priority Task", TaskPriority.CRITICAL));
        }


    }



}



class TaskWorker implements Runnable {

    private final PriorityBlockingQueue<PriorityTask> taskQueue;

    public TaskWorker(PriorityBlockingQueue<PriorityTask> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                PriorityTask task = taskQueue.take();
                System.out.println("Thread:: " + Thread.currentThread().getName() + " executing task: " + task.getName() + " with priority: " + task.getPriority());
                Thread taskThread = new Thread(task);
                taskThread.start();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread:: " + Thread.currentThread().getName() + " interrupted.");
                break;
            }
        }
    }

}


class PriorityTask implements Runnable, Comparable<PriorityTask> {


    private String name;
    private TaskPriority priority;


    public PriorityTask(String name, TaskPriority priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }
    public TaskPriority getPriority() {
        return priority;
    }

    public void run() {
        System.out.println("Thread:: " + Thread.currentThread().getName() + " executing task: " + name + " with priority: " + priority);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int compareTo(PriorityTask other) {
        return this.priority.compareTo(other.priority);
    }
}