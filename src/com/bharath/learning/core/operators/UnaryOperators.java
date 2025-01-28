package com.bharath.learning.core.operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int coutn = 10;

        coutn++;

        while (coutn < 50) {
            coutn += 10;
       //     System.out.println(coutn);
            coutn--;
     //       System.out.println(coutn);

        }
     //   System.out.println(coutn);



        int counter = 1;

        System.out.println("Pre-increment (++counter)::"+ ++counter);
        System.out.println("Pre-decrement (--counter)::"+ --counter);
        System.out.println("Post-increment (counter++)::"+ counter++);
        System.out.println("Post-decrement (counter--)::"+ counter--);
    }
}
