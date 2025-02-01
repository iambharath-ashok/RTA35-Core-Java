package com.bharath.learning.core.controlstatements;

public class BreakAndContinueExample {

    public static void main(String[] args) {

      // simpleBreakExample();
       simpleContinueExample();

    }

    private static void simpleContinueExample() {
        for (int i =0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i: "+ i);
        }
    }

    private static void simpleBreakExample() {
        for (int i =0; i < 10; i++) {
            if (i ==5) {
                break;
            }
            System.out.println("i: "+ i);
        }
    }
}
