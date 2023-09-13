package com.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteApp {
    public static void main(String[] args) {
        String File_Written_Directory = "src//com//fileHandling//javaPractice.txt";
        try(FileWriter writeFile = new FileWriter(File_Written_Directory)) {
            writeFile.write("Code is written By");
            writeFile.append(" Great Koustav Singha Roy.");
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
