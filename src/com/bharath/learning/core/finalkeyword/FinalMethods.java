package com.bharath.learning.core.finalkeyword;


class SecuritySystem {

    // final methods cannot be overridden
    // final methods is a way to prevent the method from being overridden
    // final method can be inherited but cannot be overridden
    // final methods can be overloaded
    public final void connectToSecuredSystem() {
        System.out.println("Connecting to secured system");
    }

    public final void connectToSecuredSystem(String username, String password) {
        System.out.println("Connecting to secured system with username " + username + " and password " + password);
    }
}

class BankSecuritySystem extends SecuritySystem {
    // This method cannot be overridden
    // public void connectToSecuredSystem() {
    //     System.out.println("Connecting to diff secured system");
    // }

 // Cannot override the final methods
 /*   public void connectToSecuredSystem(String username, String password) {
        System.out.println("Connecting to diff secured system with username " + username + " and password " + password);
    }*/

    public final void connectToSecuredSystem(String connectionUrl) {
        System.out.println("Connecting to diff secured system using url " + connectionUrl);
    }
}


public class FinalMethods {
    public static void main(String[] args) {
        BankSecuritySystem bankSecuritySystem = new BankSecuritySystem();
        bankSecuritySystem.connectToSecuredSystem();
        bankSecuritySystem.connectToSecuredSystem("admin", "admin");
        bankSecuritySystem.connectToSecuredSystem("http://localhost:8080");
    }
}
