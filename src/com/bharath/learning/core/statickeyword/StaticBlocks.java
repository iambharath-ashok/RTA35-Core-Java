package com.bharath.learning.core.statickeyword;



class DatabaseConnector {

    private static String connectionUrl;

    // Static block
    // Static blocks are executed when the class is loaded into memory
    // Static blocks are executed only once
    // static blocks are used to initialize static variables
    // static blocks are executed before the main method
    static {
        connectionUrl = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block executed");
    }

    // Below is instance block
    // Instance blocks are executed when the object is created
    // Instance blocks are executed every time the object is created
    {
        System.out.println("Instance block executed");
    }

    public static void connect() {
        System.out.println("Connecting to database....");
        System.out.println("Connected to database using url:: "+ connectionUrl);
    }

    public void display() {
        System.out.println("Displaying database connection details");
        System.out.println("Connected to database using url:: "+ connectionUrl);
    }

}


public class StaticBlocks {
    public static void main(String[] args) {
        DatabaseConnector.connect();
        DatabaseConnector.connect();

        DatabaseConnector databaseConnector = new DatabaseConnector();
        DatabaseConnector databaseConnector1 = new DatabaseConnector();

        databaseConnector.display();
        databaseConnector1.display();

    }
}
