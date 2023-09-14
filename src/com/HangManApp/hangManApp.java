package com.HangManApp;

import java.io.FileNotFoundException;

public class hangManApp {
    public static void main(String[] args) throws FileNotFoundException {
        GameService gameService = new GameService();
        gameService.start();
    }
}
