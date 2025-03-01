package com.bharath.learning.core.finalkeyword;

class SecurityConfig {
    private final String username = "admin";
    private final String password = "admin";
    private final String url = "http://localhost:8080";


    public void connectToSecuredSystem() {
        System.out.println("Connecting to " + url + " with username " + username + " and password " + password);
    }
}


public class FinalVariables {

    public static void main(String[] args) {
        SecurityConfig securityConfig = new SecurityConfig();
        securityConfig.connectToSecuredSystem();
    }

}
