package com.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class linkedHashMapApp {
    public static void main(String[] args) {
        Map<String, Integer> ProductPriceHashMap = new HashMap<>();
        System.out.println("List of hashmap product");
        ProductPriceHashMap.put("Choclate", 12);
        ProductPriceHashMap.put("Begun", 30);
        ProductPriceHashMap.put("Potol", 11);
        ProductPriceHashMap.put("Potato", 12);
        for(String product: ProductPriceHashMap.keySet()) {
            System.out.println(product + "$" +ProductPriceHashMap.get(product));
        }

        Map<String, Integer> ProductPriceHashLinkHashMap = new LinkedHashMap<>();
        System.out.println("List of Linkedhashmap product");
        ProductPriceHashLinkHashMap.put("Choclate", 12);
        ProductPriceHashLinkHashMap.put("Begun", 30);
        ProductPriceHashLinkHashMap.put("Potol", 11);
        ProductPriceHashLinkHashMap.put("Potato", 12);
        for(String productList: ProductPriceHashLinkHashMap.keySet()) {
            System.out.println(productList + "$" +ProductPriceHashLinkHashMap.get(productList));
        }

        Map<String, Integer> ProductPriceHashTreeHashMap = new TreeMap<>();
        System.out.println("List of Linkedhashmap product");
        ProductPriceHashTreeHashMap.put("Choclate", 12);
        ProductPriceHashTreeHashMap.put("Begun", 30);
        ProductPriceHashTreeHashMap.put("Potol", 11);
        ProductPriceHashTreeHashMap.put("Potato", 12);
        for(String productList: ProductPriceHashTreeHashMap.keySet()) {
            System.out.println(productList + "$" +ProductPriceHashTreeHashMap.get(productList));
        }
     }
}
