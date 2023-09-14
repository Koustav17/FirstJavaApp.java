package com.HangManApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameService {
    public static final String defaultLoadedFile = "src//com//fileHandling//sample3.txt";
    public void start() throws FileNotFoundException {
        String randomWords = getRandomWords();
        System.out.println(randomWords);
    }

    private String getRandomWords() throws FileNotFoundException {
        List<String> words = getWords();
        Random randomNumGenerator = new Random();
        int randomIndex = randomNumGenerator.nextInt(words.size());
        return words.get(randomIndex);
    }

    private List<String> getWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        File wordFile = new File(defaultLoadedFile);
        Scanner wordScanner = new Scanner(wordFile);
        while(wordScanner.hasNextLine()) {
            words.add(wordScanner.nextLine());
        }
        return words;
    }
}
