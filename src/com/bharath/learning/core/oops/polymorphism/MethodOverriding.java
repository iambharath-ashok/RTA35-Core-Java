package com.bharath.learning.core.oops.polymorphism;

class Payment {

    public void processPayment(double amount) {
        System.out.println("Processing the payment of ::"+ amount);
    }
}


class CreditCard extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of "+amount+" through Credit Card");
    }
}


class Paypal extends  Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of "+amount+" through Paypal");
    }
}



public class MethodOverriding {

    public static void main(String[] args) {


        Payment payment; // Parent Type Reference Variable


        payment = new CreditCard();
        payment.processPayment(10);

        payment = new Paypal();
        payment.processPayment(10);




    }
}
