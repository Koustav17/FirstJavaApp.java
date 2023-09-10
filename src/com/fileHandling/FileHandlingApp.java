package com.fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;

public class FileHandlingApp {
    public static void main(String[] args) {
        String File_Handling_Directory = "src\\com\\fileHandling\\";
        File fileHandling =  new File(File_Handling_Directory + "fileCreated.txt");
        try {
            if(fileHandling.createNewFile()) {
                System.out.println("File is created");
            }
        } catch(IOException exception) {
            exception.printStackTrace();
        }
        File fileReplaced = new File(File_Handling_Directory + "fileCreatedRename.txt");
        if(fileHandling.renameTo(fileReplaced)) {
            System.out.println("File Replaced");
        }
        if(fileReplaced.delete()) {
            System.out.println("File deleted");
        }
        System.out.println("List of Files in folder:");
        File FileCountInDirectory = new File("src\\com\\fileHandling");
        
        System.out.println(Arrays.toString(FileCountInDirectory.list()));
        System.out.println(Arrays.toString(FileCountInDirectory.listFiles()));

        File fileHandlingApp = new File("src\\com\\fileHandling\\FileHandlingApp.java");
        Calendar lastDateOfModification = Calendar.getInstance();
        fileHandlingApp.setLastModified(Calendar.getInstance().getTimeInMillis());
        lastDateOfModification.setTimeInMillis(FileCountInDirectory.lastModified());
        System.out.println("Last Modified Date" +lastDateOfModification.getTime());
    }
}
