package com.bharath.learning.core.java8.lambda;


public interface GreetingMessage {

   // void sayHello();

    void sayHello(String from, String to);
}


class GreetingMessageRunner {
    public static void main(String[] args) {

        /*GreetingMessage message = () -> {
            System.out.println("Hello, World!");
        };

        message.sayHello();
        */
        GreetingMessage messageWithName = (from, to) -> {
            System.out.println("Hello, from " + from +", to " + to+ "!");
        };

        messageWithName.sayHello("John", "Jane");

    }
}