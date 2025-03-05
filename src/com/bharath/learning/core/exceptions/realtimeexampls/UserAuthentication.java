package com.bharath.learning.core.exceptions.realtimeexampls;


// Checked exception is created by extending Exception class
// Checked exception is also called as compile time exception
// Below is an example of Custom checked exception

class TooManyFailedAttemptsException extends Exception {
    public TooManyFailedAttemptsException(String message) {
        super(message);
    }
}




public class UserAuthentication {

    private static int failedAttempt = 0;

    private static void login(final String password) throws TooManyFailedAttemptsException {

        String correctPassword = "CorrectPass@123";

        if (!correctPassword.equals(password)) {
            failedAttempt ++;
            if (failedAttempt >= 3) {
                throw new TooManyFailedAttemptsException("Account is locked due to multiple failed attempts. Please try after 24 hours");
            }
            System.out.println("Incorrect password attempt: " + failedAttempt);
        } else {
            System.out.println("Login successful");
        }

    }


    public static void main(String[] args)  {

        System.out.println("Pls enter the password");

        try {
            login("wrongPass");
            login("wrongPass");
            login("wrongPass");
        } catch (TooManyFailedAttemptsException e) {
            System.out.println("Error: " + e.getMessage());
            // Re-throwing the exception
            throw new RuntimeException(e);
        }

    }
}
