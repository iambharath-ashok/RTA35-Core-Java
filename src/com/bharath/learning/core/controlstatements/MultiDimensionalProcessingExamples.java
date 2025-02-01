package com.bharath.learning.core.controlstatements;

public class MultiDimensionalProcessingExamples {

    public static void main(String[] args) {
//        loopInsideLoop();
//        twoDimensionalArrayProcessing();
        starPattern();
    }

    private static void starPattern() {

        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void twoDimensionalArrayProcessing() {

        int singleDimensional[] = {1,2,4,4,6};
        int twoDimensional[][] = {
                {1,3,4,6},
                {9,9},
                {10, 44}
        };

        int treeDimensional[][][] = {
                {
                    {1,2,3,4},
                    {2,5,7,9}
                },
                {
                    {10, 5,90}
                }
        };

        int [][] numbers = {
                {1,2,3, 77},
                {4,5,6},
                {7,8,9, 50,90},
        };


        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column< numbers[row].length; column++) {
                System.out.print(numbers[row][column]+ " ");
            }
            System.out.println();
        }


    }

    private static void loopInsideLoop () {

        for (int i = 0; i <= 5; i++) {
            System.out.print("i: "+ i);
            for (int j = 0; j <= 5; j++) {
                System.out.println( "j: "+ j);
            }
            System.out.println();
        }


    }
}
