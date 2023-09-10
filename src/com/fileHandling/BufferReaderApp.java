package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class BufferReaderApp {
    public static void main(String[] args) {
        String FILE_Reader_Directory = "src//com//fileHandling//sample3.txt";
        try(FileReader filereader = new FileReader(FILE_Reader_Directory)) {
            BufferedReader fileBufferReader = new BufferedReader(filereader);
            String fileReadedLines = fileBufferReader.lines().collect(Collectors.joining(System.lineSeparator()));
            System.out.println("Readed Line");
            System.out.println(fileReadedLines);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
