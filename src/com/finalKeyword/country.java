package com.finalKeyword;

public class country {
    public final String CountryName;
    public int population;
    public String capital;
    public static int numberOfCountries = 5;

    public country(String countryName, int population, String capital) {
        CountryName = countryName;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }

    public final void populationChange(int change) {
        population += change;
    }
    public void getDetails() {
        System.out.println("Country Name:" +CountryName + "Population:" +population  + "Capital:" +capital);
    }
    public static int getNumberOfCountries() {
        return numberOfCountries;
    }
}
