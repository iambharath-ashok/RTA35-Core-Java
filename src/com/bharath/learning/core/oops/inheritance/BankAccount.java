package com.bharath.learning.core.oops.inheritance;

public class BankAccount  {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    protected void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited Amount::"+amount);
    }

    protected  void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw success of amount:: "+amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return this.balance;
    }

}



class SavingsAccount extends BankAccount {

    private double interest;

    public SavingsAccount(String accountNumber, double balance, double interest) {
        super(accountNumber, balance);// Constructor Chaining
    }

    public void applyInterest() {
        double interestEarnedAmount = (this.getBalance() * (interest/100) * 3/12)/100;
        this.deposit(interestEarnedAmount);

    }

}

class CurrentAccount extends BankAccount {

    private double overdraftLimit;


    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        overdraftLimit += amount;
        System.out.println("Amount paid to Overdraft::"+ amount);
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = super.getBalance() + overdraftLimit;
        if (amount <= availableBalance) {
            this.overdraftLimit -= amount;
            System.out.println("Withdraw success on current account of amount "+ amount);
            System.out.println("Current Account balance:: "+ (this.overdraftLimit + super.getBalance()));
        } else {
            System.out.println("Exceeds Overdraft Limit");
        }
    }

    public double getBalance() {
        return super.getBalance() + overdraftLimit;
    }

}


class BankRunner {
    public static void main(String[] args) {

        BankAccount savingsAccount =  new SavingsAccount("SA001", 7000, 3.5);
        BankAccount currentAccount = new CurrentAccount("CA001", 3000, 500000);

        savingsAccount.deposit(8000);
        savingsAccount.withdraw(5000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100000);


        System.out.println(currentAccount.getBalance());

        currentAccount.withdraw(20000);


    }
}
