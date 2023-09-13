package com.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        String FILE_Reader_Directory = "src//com//fileHandling//sample3.txt";
        try(Scanner scanner = new Scanner(new File(FILE_Reader_Directory))) {
            scanner.useDelimiter(",");
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
