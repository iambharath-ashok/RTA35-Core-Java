package com.bharath.learning.core.oops.abstraction;

// Bank is Abstract class
abstract class Bank {

    public Bank() {
        super();
    }

    // what is abstract method?
    abstract void withdrawMoney(double amount);

    //what is concrete method
    public void checkBalance() {
        System.out.println("Checking balance...");
    }

}

// Concrete Sub-Class
class ATM extends Bank {

    //default constructor
    public ATM() {
      super();
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Withdrawing amount from ATM:: "+ amount );
    }

}

// Concrete Sub-Class
class OnlineBanking extends Bank {

    @Override
    void withdrawMoney(double amount) {
        System.out.println("Withdrawing amount from OnlineBanking:: "+ amount );

    }
}


public class BankAbstractionExample {

    public static void main(String[] args) {

        Bank myBank;

        myBank = new ATM();
        myBank.withdrawMoney(200);


        myBank = new OnlineBanking();
        myBank.withdrawMoney(800);

    }
}
