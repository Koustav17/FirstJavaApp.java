package com.fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyAndMoveApp {
    public static void main(String[] args) {
        Path originFilePath = Paths.get("src//com//fileHandling//javaPractice.txt");
        Path movedFilePath = Paths.get("src//com//exception//javaPractice.txt");
        try {
            if(Files.exists(originFilePath)) {
                Files.move(originFilePath, movedFilePath, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
