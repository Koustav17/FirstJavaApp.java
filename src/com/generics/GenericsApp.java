package com.generics;

import java.util.ArrayList;

public class GenericsApp {
    public static void main(String[] args) {
        Box<Integer> myFavouriteNumber = new Box<>();
        myFavouriteNumber.setTypeData(7);
        Util.displayToString(myFavouriteNumber);

        Box<String> myFavouriteMovie = new Box<>();
        myFavouriteMovie.setTypeData("The Forgoten Battle");
        Util.displayToString(myFavouriteMovie);

        ArrayList<Box<String>> insertIntoArrayAsString = new ArrayList<>();
        insertIntoArrayAsString.add(myFavouriteMovie);
        Util.displayToString(insertIntoArrayAsString);

        ArrayList<Box<Integer>> insertIntoArrayAsNumber = new ArrayList<>();
        insertIntoArrayAsNumber.add(myFavouriteNumber);
        Util.displayToString(insertIntoArrayAsNumber);

        OrderedPair<Integer, String> newOrderedPair = new OrderedPair<>(1, "Koustav");
        OrderedPair<String, String> latestOrdered = new OrderedPair<>("First", "Koustav");

        ArrayList <OrderedPair<String, String>> ListOrder = new ArrayList<>();
        ListOrder.add(latestOrdered);
        ArrayList <OrderedPair<Integer, String>> OldOrder = new ArrayList<>();
        OldOrder.add(newOrderedPair);

        Util.displayToString(ListOrder);
        Util.displayToString(OldOrder);
    }
}
