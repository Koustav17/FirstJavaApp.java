package com.LinkedHashMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeHashMapFunctions {
    public static void main(String[] args) {
        TreeMap<String, Integer> ProductPriceHashTreeHashMap = new TreeMap<>();
        System.out.println("List of Linkedhashmap product");
        ProductPriceHashTreeHashMap.put("Choclate", 12);
        ProductPriceHashTreeHashMap.put("Begun", 30);
        ProductPriceHashTreeHashMap.put("Potol", 11);
        ProductPriceHashTreeHashMap.put("Potato", 12);
        System.out.println("Last Product Name in the List: " +ProductPriceHashTreeHashMap.firstKey());
        for(String productList: ProductPriceHashTreeHashMap.keySet()) {
            System.out.println(productList + " $" + ProductPriceHashTreeHashMap.get(productList));
        }

        System.out.println("Navigable Map Has been Set:");
        NavigableMap<String, Integer> ProductPriceHashNavTreeHashMap = ProductPriceHashTreeHashMap.descendingMap();
        for(String productList: ProductPriceHashNavTreeHashMap.keySet()) {
            System.out.println(productList + " $" + ProductPriceHashNavTreeHashMap.get(productList));
        }

        System.out.println();
        System.out.println("Lower key:" +ProductPriceHashNavTreeHashMap.lowerKey("Pepe"));
        System.out.println("Floor key:" +ProductPriceHashNavTreeHashMap.floorKey("Choclate"));
        System.out.println("Higher key:" +ProductPriceHashNavTreeHashMap.higherKey("Choclate"));
        System.out.println("Ceil key:" +ProductPriceHashNavTreeHashMap.ceilingKey("Choclate"));
    }
}
