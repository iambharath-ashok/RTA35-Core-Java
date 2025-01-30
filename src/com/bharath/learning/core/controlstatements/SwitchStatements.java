package com.bharath.learning.core.controlstatements;

import java.util.Scanner;

public class SwitchStatements {


    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name for application");
        String name = scan.nextLine();

        switchStatement(name);

        System.out.println("Enter the Age");
        int age = scan.nextInt();
        ifSwitchStatement(age);

        System.out.println("Main Method Ended");


        SwitchStatements objec3 = new SwitchStatements();
    }


    private static void switchStatement(String name) {

        System.out.println("Enterning Switch Statement Method");


        switch (name) {

            case "Aegon" :
                System.out.println("Targaryn");
                break;
            case "Arya":
                System.out.println("Stark");
                break;
            case "Jaime":
                System.out.println("Lannister");
                break;
            case "Ramsay":
                System.out.println("Bolton");
                break;
            default:
                System.out.println("Bastard");

        }


        System.out.println("Exiting Switch Statement Method");


    }

    private static void ifSwitchStatement(int age) {

        switch (age) {
            case 18:
                System.out.println("Minor");
                break;
            case 21:
                System.out.println("Adult");
                break;
            default:
                System.out.println("wrong input");
        }
    }
}
