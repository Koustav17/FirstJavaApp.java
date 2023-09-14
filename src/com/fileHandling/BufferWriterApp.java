package com.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterApp {
    public static void main(String[] args) {

        try(BufferedWriter writePraiceJSONFile = new BufferedWriter(new FileWriter("src//com//fileHandling//javaPractice.txt"))) {
            writePraiceJSONFile.write("Good morning MR Koustav.");
            writePraiceJSONFile.newLine();
            writePraiceJSONFile.write("How are you?");
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }

}
