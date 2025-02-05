package com.bharath.learning.core.oops.encapsulation;

public class BankAccount {

    public double getBalance() {
        return balance;
    }

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial Balance should not be negative.");
        }
    }


    // deposit
    public void deposit(double amount) {
        // login
        // authentication
        //authorization
        if (amount > 0) {
            balance += amount; // balance = balance + amount
            System.out.println("Deposited: "+ amount);
        } else {
            System.out.println("Deposit amount should be positive");
        }
    }


    // withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdrawn success for : "+ amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

}


class Runner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        account.deposit(1000);
        account.deposit(700);

        account.withdraw(9000);
        account.withdraw(900);

        System.out.println("Current Balance: "+ account.getBalance());



    }
}