package com.bharath.learning.core.exceptions;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// Below is traditional way of handling resources
// We need to close the resources explicitly in finally block
// This is error prone as we may forget to close the resources
// This what we were doing before Java 7
public class TryWithOutResourcesExample {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("file.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error reading file");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing bufferedReader");
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing fileReader");
                }
            }
        }
    }

}


class CustomResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing custom resource");
    }
}

class TryWithResourcesExample {


    public static void main(String[] args) {

        // This is the same as the TryWithOutResourcesExample, but with the try-with-resources syntax
        // The try-with-resources syntax automatically closes the resources declared in the try block
        // In our case, the FileReader and BufferedReader are automatically closed
        // In order to use the try-with-resources syntax, the resource must implement the AutoCloseable interface
        // Try with resources is available from Java 7

        try (FileReader fileReader = new FileReader("");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        CustomResource customResource = new CustomResource()) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }


    }
}
