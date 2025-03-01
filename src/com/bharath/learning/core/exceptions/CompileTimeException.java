package com.bharath.learning.core.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileProcessor {

    private static String fileName = "secret.txt";

    public void processFile() {
        System.out.println("Processing file");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("File processed successfully");
    }
}


public class CompileTimeException {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile();
    }
}
