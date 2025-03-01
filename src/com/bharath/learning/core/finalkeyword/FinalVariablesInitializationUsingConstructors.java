package com.bharath.learning.core.finalkeyword;


class BankAccount {
    // final variables can be initialized using constructors
    //
    private final int accountNumber;
    private final String accountHolderName;
    public double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
}



public class FinalVariablesInitializationUsingConstructors {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(101, "Bharath", 1000);
        bankAccount.displayAccountDetails();

        bankAccount.deposit(100);
        bankAccount.displayAccountDetails();

         //bankAccount.accountNumber = 102; // Compilation Error: cannot assign a value to final variable accountNumber
        //bankAccount.accountHolderName = "John"; // Compilation Error: cannot assign a value to final variable accountHolderName
    }
}
