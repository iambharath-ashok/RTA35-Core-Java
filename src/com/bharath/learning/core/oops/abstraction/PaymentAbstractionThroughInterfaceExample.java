package com.bharath.learning.core.oops.abstraction;

// interface is defined with interface keyword
interface Payment {

    // Abstract method
    void processPayment(double amount);
}


class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of amount :: "+ amount);
    }
}


class CreditCard implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CreditCard Payment of amount :: "+ amount);

    }
}


class UPIPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of amount :: "+ amount);

    }
}



public class PaymentAbstractionThroughInterfaceExample {

    public static void main(String[] args) {

        Payment paymentMethod;

        paymentMethod = new CreditCard();
        paymentMethod.processPayment(100);


        paymentMethod = new PayPalPayment();
        paymentMethod.processPayment(800);

        paymentMethod = new UPIPayment();
        paymentMethod.processPayment(500);

    }
}
