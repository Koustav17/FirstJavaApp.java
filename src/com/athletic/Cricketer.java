package com.athletic;

public class Cricketer extends Athletic implements isPLayingBasketBall {
     public String playingBasketBall;
     public Cricketer(String PlayerName, int noOfCentury, String countryName) {
         super(PlayerName, noOfCentury, countryName);
     }

     @Override
     public String getPlayerName() {
          super.getPlayerName();
          System.out.println("Player Name:" +PlayerName);
          return null;
     }

     public void GetPlayerInfo() {
          super.getPlayerInfo();
     }

     @Override
     public void playingBasketBall(String playingBasketBall) {
          this.playingBasketBall = playingBasketBall;
     }

     @Override
     public String getPlayingBasketBall() {
          return this.playingBasketBall;
     }
}
