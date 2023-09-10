package com.athletic;

public class MainAthleticController {
    public static void main(String[] args) {
        Cricketer cricketer = new Cricketer("Virat", 74, "India");
        cricketer.setNoOfCentury();
        cricketer.getPlayerName();
        cricketer.getPlayerInfo();
        cricketer.playingBasketBall("Not");
        System.out.println("Virat is " +cricketer.getPlayingBasketBall() + " playing" +  " Basketball");
    }


}
