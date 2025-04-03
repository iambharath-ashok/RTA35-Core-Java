package com.bharath.learning.core.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {



        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(100);
        priorityQueue.add(-398);


        //
         //20
        //10
        //20
        // 10
        //20 100
        // -398
        // -398
        //10    100
        // 20

        System.out.println("Priority Queue: " + priorityQueue);

        // 10, 20, 100, -398

        //-398, 10, 20, 100

        //20
        //10, 20
        //10, 20, 100
        //-398, 10, 20, 100

        //[20]
        // [10, 20]
        // [10, 20, 100]
        //[-398, 10, 100, 20]

        // [20, 10]
        // [10, 20]
        // [100, 10, 20]
        // [100, 10, 20, -398]


        //[10, 5, 15, 3]

//        [10]
//        [5,10]
//        [5, 10, 15]
//        [3,10, 15, 5]
//
//
//          3
//        5   15
//       10









    }
}
