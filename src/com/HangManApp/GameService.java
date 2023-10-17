package com.HangManApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GameService {
    public static final String defaultLoadedFile = "src//com//fileHandling//sample3.txt";
    public void start() throws FileNotFoundException {
        Scanner inputScanner = new Scanner(System.in);
        String randomWords = getRandomWords();
        char[] radomWordArray = randomWords.toCharArray();
        char[] guessArray = new char[randomWords.length()];

        Arrays.fill(guessArray, '-');
        int numberOfChoice = randomWords.length();

        System.out.println("Starting the game");
        System.out.println("The length of the word and no of the chances " +numberOfChoice);

        while (true) {
            System.out.println("------------------------");
            System.out.println("Please enter a new word:");
            String inputLine = inputScanner.nextLine().toLowerCase();
            char letter = inputLine.charAt(0);

            boolean isGuessingCorrect = false;
            for (int i = 0; i <randomWords.length() ; i++) {
                if(letter == radomWordArray[i]) {
                    guessArray[i] = letter;
                    isGuessingCorrect = true;
                }
            }

            if(isGuessingCorrect) {
                System.out.println("It was a good guess");
                if(isGameFinished(guessArray, randomWords)) {
                    break;
                }
            } else {
                numberOfChoice --;
                if(numberOfChoice == 0) {
                    System.out.println("Sorry you ran out of chances");
                    System.out.println("The word was " +randomWords);
                    break;
                }
                System.out.println("Your no of chances is decreased to:" +numberOfChoice);
                System.out.println("Please try another letter!");
            }
            System.out.println("The word " +new String(guessArray));
        }
    }

    private boolean isGameFinished(char[] guessArray, String randomWords) {
        for (int i = 0; i <guessArray.length ; i++) {
            if(guessArray[i] == '_') {
                return false;
            }
        }
        System.out.println("Congratulations you won!");
        System.out.println("The word is:" +randomWords);
        return true;
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
