package com.athletic;

public abstract class Athletic {
    public String PlayerName;
    public int NoOfCentury;
    public String CountryName;

    public Athletic(String playerName, int noOfCentury, String countryName) {
        PlayerName = playerName;
        NoOfCentury = noOfCentury;
        CountryName = countryName;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setNoOfCentury() {
        ++this.NoOfCentury;
    }

    public void getPlayerInfo() {
        System.out.println("Cricketer Name: " +this.PlayerName);
        System.out.println("Player Century Count: " +this.NoOfCentury);
        System.out.println("Player Country Name: " +this.CountryName);
    }

    public abstract String getPlayingBasketBall();
}
