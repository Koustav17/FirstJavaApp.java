package com.fileHandling;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderApp {
    public static void main(String[] args) {
        String FILE_Reader_Directory = "src//com//fileHandling//sample3.txt";
        char[] readNewHundredOfChar = new char[100];
        try (FileReader fileReader = new FileReader(FILE_Reader_Directory)) {
            fileReader.read(readNewHundredOfChar);
            System.out.println(readNewHundredOfChar);
            fileReader.read(readNewHundredOfChar);
            System.out.println(readNewHundredOfChar);
            System.out.println("Read more");
            System.out.println();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
