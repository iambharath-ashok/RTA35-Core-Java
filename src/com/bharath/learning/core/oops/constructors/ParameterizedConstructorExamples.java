package com.bharath.learning.core.oops.constructors;



class BankAccount {

    private int accountNumber;
    private double balance;
    private String accountHolderName;

    // Parameterized Constructors
    public BankAccount(int acNum, double bal, String accHN) {
        this.accountNumber = acNum;
        this.balance = bal;
        this.accountHolderName = accHN;
    }


    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }




    public void display() {
        System.out.println("Account Number:: " + accountNumber + " Balance:: " + balance + " AccountHolderName:: "+ accountHolderName);
    }
}






public class ParameterizedConstructorExamples {


    public static void main(String[] args) {
        BankAccount hdfcBankAccount = new BankAccount(007, 101, "Bharath");
        BankAccount jpmcAccount = new BankAccount(0021, 90, "" );
        BankAccount boAmericaAccount = new BankAccount(9);


        hdfcBankAccount.display();
        jpmcAccount.display();
        boAmericaAccount.display();
    }
}
