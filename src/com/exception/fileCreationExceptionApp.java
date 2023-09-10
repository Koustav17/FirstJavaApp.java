package com.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileCreationExceptionApp {
    public static void main(String[] args) {
        createFile("outputFile1.txt");
    }
    public static void createFile(String FileName) {
//      PrintWriter outputFile = null;
        try(PrintWriter outputFile = new PrintWriter(new FileWriter(FileName))) {
            outputFile.println("Hello");
        } catch(IOException exception) {
            System.err.println("caught an IOException:" + exception.getMessage());
        }
        System.out.println("This line comes after we try to create a file.");
    }
}
