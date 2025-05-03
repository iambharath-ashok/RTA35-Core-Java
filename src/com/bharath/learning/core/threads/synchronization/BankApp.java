package com.bharath.learning.core.threads.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CasaAccount {
    private int balance;
    private final Lock lock = new ReentrantLock();

    public CasaAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance = balance - amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " insufficient balance. Withdrawal of " + amount + " failed.");
            }
         } finally {
            lock.unlock();
        }

    }
}


class WithdrawalTransaction extends Thread {

    private CasaAccount account;
    private int amountToWithdraw;

    public WithdrawalTransaction(CasaAccount account, int amountToWithdraw) {
        this.account = account;
        this.amountToWithdraw = amountToWithdraw;
    }

    public void run() {
        account.withdraw(amountToWithdraw);
    }

}


public class BankApp {

    public static void main(String[] args) {
        CasaAccount account = new CasaAccount(1000);


        // Create multiple threads that will access the shared resource
        WithdrawalTransaction transaction1 = new WithdrawalTransaction(account, 500);
        WithdrawalTransaction transaction2 = new WithdrawalTransaction(account, 700);
        WithdrawalTransaction transaction3 = new WithdrawalTransaction(account, 300);

        // Start the threads
        transaction1.start();
        transaction2.start();
        transaction3.start();

        // Wait for threads to finish
        try {
            transaction1.join();
            transaction2.join();
            transaction3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}

