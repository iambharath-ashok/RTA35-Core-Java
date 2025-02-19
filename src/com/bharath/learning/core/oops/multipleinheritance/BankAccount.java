package com.bharath.learning.core.oops.multipleinheritance;

public interface BankAccount {
    void deposit(double amount);
}

class SavingsAccount implements BankAccount, ProcessPayment {

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited  amount "+ amount);
    }
}



class Runner {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        account.deposit(1000);
    }
}
