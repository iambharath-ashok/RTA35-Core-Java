package com.bharath.learning.core.operators;

public class BitwiseOperators {

    public static void main(String[] args) {

        int num1 = 5;// Binary Representation : 0000 0101
        int num2 = 3;// Binary Representation : 0000 0011
        //-------------------------------------------------
        //Bitwise AND  5 & 3 = 1                0000 0001
        //Bitwise OR  5 | 3 = 7                 0000 0111
        //Bitwise NOT  ~num1  ~5 = -6           1111 1010
        //Bitwise XOR  5 ^ 3 = 6                0000 0110

       // 0000 0110 >> 0110 0000


        System.out.println("num1 & num2 :: "+ (num1 & num2));
        System.out.println("num1 1 num2 :: "+ (num1 | num2));
        System.out.println("num1 ^ num2 :: "+ (num1 ^ num2));
        System.out.println("~num1 :: "+ ~num1);


        int newNumber = -450;

        System.out.println("Binary String of -450:: "+Integer.toBinaryString(newNumber));









    }
}
