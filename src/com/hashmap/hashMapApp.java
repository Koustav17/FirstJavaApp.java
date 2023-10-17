package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMapApp {
    public static void main(String[] args) {
        Scanner addCountry = new Scanner(System.in);
        Map<String, String> capitals = new HashMap<>();
        capitals.put("England", "London");
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washingtone");
//        capitals.put("England", "walse");
//        System.out.println("Capital of england is:" +capitals.get("England"));
        capitals.remove("England", "walse");
        System.out.println("Capital of england is:" +capitals.get("England"));
        if(capitals.containsValue("Washingtone")) {
            System.out.println("United States is in the list");
        }
        System.out.println("Please enter country Name:");
        String userInput = addCountry.next();
//        if(capitals.containsKey(userInput)) {
//            System.out.println(capitals.get("County is in the list" +userInput));
//        } else {
//            System.out.println(capitals.get("County is not in the list" +null));
//        }
//        capitals.replace("India", "New Delhi", "Kolkata");
//        System.out.println("Capital Of India got changed:" +capitals.get("India"));

        capitals.putIfAbsent(userInput, "Madrid");
        System.out.println(capitals.size() +"List of country Name:");
        for(String country: capitals.keySet()) {
            System.out.println("-" +country);
        }
        System.out.println(capitals.size() +"List of capital Name:");
        for(String countryKey: capitals.values()) {
            System.out.println("-" +countryKey);
        }
    }
}
