package com.bharath.learning.core.collections.queue;

import java.util.PriorityQueue;

public class TaskSchedulerExample {

    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        taskQueue.offer(new Task("Low Priority Task", TaskPriority.LOW));
        taskQueue.offer(new Task("High Priority Task", TaskPriority.HIGH));
        taskQueue.offer(new Task("Medium Priority Task", TaskPriority.MEDIUM));
        taskQueue.offer(new Task("Low Priority Task", TaskPriority.LOW));
        taskQueue.offer(new Task("High Priority Task", TaskPriority.HIGH));
        taskQueue.offer(new Task("Critical Priority Task", TaskPriority.CRITICAL));

        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing task: " + task.getName() + " with priority: " + task.getPriority());
            Thread taskThread = new Thread(task);
            taskThread.start();
        }
        System.out.println("==========================================================");
    }
}

class Task implements Comparable<Task>, Runnable {

    private String name;
    private TaskPriority priority;

    public Task(String name, TaskPriority priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return this.priority.compareTo(other.priority);
    }

    @Override
    public void run() {
        System.out.println("Thread:: " + Thread.currentThread().getName() + " executing task: " + name + " with priority: " + priority);
    }

}

enum TaskPriority {
    CRITICAL,
    HIGH,
    MEDIUM,
    LOW;
}
