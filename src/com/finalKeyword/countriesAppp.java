package com.finalKeyword;

public class countriesAppp {
    public static void main(String[] args) {
        System.out.println("No of countries:" +country.getNumberOfCountries());
        country brazil = new country("Brazil", 7000000, "Brazilia");
        brazil.getDetails();
        country argentina = new country("Argentina", 90000000, "Buenos Aires");
        argentina.getDetails();
        System.out.println("No of countries:" +country.getNumberOfCountries());
    }
}
