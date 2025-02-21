package com.bharath.learning.core.paymentprocessorapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface Payment {

    void processPayment(double amount);
    void refundPayment(double amount);
    String getTransactionStatus(String transactionId);
    void getPaymentHistory();

}


abstract class OnlinePayment implements Payment {
    protected List<String> transactionsList = new ArrayList<>();


    void logPayment(String transactionId, double amount) {
        this.transactionsList.add("TransactionId: "+ transactionId + " | Amount: "+ amount);
        System.out.println("Logging: Payment of amount "+ amount + "| Transaction Id:"+transactionId);
    }

    void validateTransaction() {
        System.out.println("Transaction validated successfully");
    }

    @Override
    public void getPaymentHistory() {
        System.out.println("Transaction History: ");
        for (String transaction : this.transactionsList) {
            System.out.println(transaction);
        }
    }

}



class CreditCard extends OnlinePayment {

    @Override
    public void processPayment(double amount) {
        this.validateTransaction();
        String transactionId = UUID.randomUUID().toString();
        logPayment(transactionId, amount);
        System.out.println("Processing Credit Card Payment for amount: "+ amount);

    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding "+ amount + " back to Credit Card");
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        return "Transaction " + transactionId + " is successful";
    }
}


class Paypal extends OnlinePayment {

    @Override
    public void processPayment(double amount) {
        this.validateTransaction();
        String transactionId = UUID.randomUUID().toString();
        logPayment(transactionId, amount);
        System.out.println("Processing Payment of amount: "+ amount+ " through Paypal");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding "+ amount + " to Paypal");
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        return "Transaction " + transactionId + " is pending";
    }
}

class UPI extends OnlinePayment {

    @Override
    public void processPayment(double amount) {
        this.validateTransaction();
        String transactionId = UUID.randomUUID().toString();
        logPayment(transactionId, amount);
        System.out.println("Processing Payment of amount: "+ amount+ " through UPI");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding "+ amount + " to UPI ID");

    }

    @Override
    public String getTransactionStatus(String transactionId) {
        return "Transaction " + transactionId + " is Completed";
    }
}

