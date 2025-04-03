package com.bharath.learning.core.collections.queue;

import java.util.ArrayDeque;

public class PrintingSystem {

    public static void main(String[] args) {

        ArrayDeque<String> printQueue = new ArrayDeque<>();

        printQueue.offer("Document1.pdf");
        printQueue.offer("Gilbhi-image.png");
        printQueue.offer("Report.docx");



        while (!printQueue.isEmpty()) {
            String document = printQueue.poll(); // Retrieves and removes the head of the queue
            System.out.println("Printing " + document);
        }

    }
}
