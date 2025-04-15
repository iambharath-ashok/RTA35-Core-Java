package com.bharath.learning.core.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SessionManagementWithHashMap {

    public static void main(String[] args) {

        Map<String, String> sessionStore = new HashMap<>();
        sessionStore.put("username", "john_doe");
        sessionStore.put("password", "password123");
        sessionStore.put("jwt_token", "JWT_TOKEN_ABC123456");
        sessionStore.put("jwt_token", "JWT_TOKEN_ABC123456");
        sessionStore.put("jwt_token", "JWT_TOKEN_ABC123456");
        sessionStore.put("session_id", "SESSION_ID_123456");
        sessionStore.put("session_id", "SESSION_ID_123456");
        sessionStore.put("session_id", "SESSION_ID_123456");


        // Retrieving session data
        String username = sessionStore.get("username");
        String password = sessionStore.get("password");
        String jwtToken = sessionStore.get("jwt_token");
        String sessionId = sessionStore.get("session_id");

        // Displaying session data
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("JWT Token: " + jwtToken);

    }
}
