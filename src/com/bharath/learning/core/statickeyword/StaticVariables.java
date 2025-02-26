package com.bharath.learning.core.statickeyword;


class BankAccount {

    // Instance Variables
    // Object level variables
    private String accountHolderName;
    private double balance;

    // Static Variable for common interest rate
    // Class level variable
    private static double interestRate = 8.5;


    // Parameterized Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Static Method to set interest rate
    // Static methods can only access static variables
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Instance Method to display account details
    // Instance methods can access both instance and static variables
    // Instance methods belongs to objects
    public void displayAccount() {
        System.out.println("Account Holder Name:: " + accountHolderName + " Balance:: " + balance + " Interest Rate:: " + interestRate);
    }

}






public class StaticVariables {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Bharath", 1000);
        BankAccount account2 = new BankAccount("John", 2000);

        // Displaying account details
        // Non-static methods are accessed using object reference
        account1.displayAccount();
        account2.displayAccount();

        // Setting interest rate using static method
        // Static methods are accessed using class name
        // Its not good practice to access static variables using object reference
        BankAccount.setInterestRate(9.5);

        account1.displayAccount();
        account2.displayAccount();
    }
}
