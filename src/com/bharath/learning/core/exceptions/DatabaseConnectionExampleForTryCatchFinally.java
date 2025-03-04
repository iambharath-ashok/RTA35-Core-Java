package com.bharath.learning.core.exceptions;

import java.sql.*;

public class DatabaseConnectionExampleForTryCatchFinally {

    public static void main(String[] args) {

        Connection conn = null;

        // Finally block is used to clean the resources like closing the database connections
        // Finally block is executed no matter exception is thrown or not
        // Finally will always get executed.
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            System.out.println("Connection established");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee");
        } catch (SQLException e) {
            System.out.println("Exception occurred while connecting to database");
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing connection");
            }
        }

    }

}
