package com.ArrayFunctions;

import java.util.Arrays;

public class ArrayFunctionApp {
    public static void main(String[] args) {
        int[] gamePoints = new int[10];
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The First 10 Players:");
        Arrays.fill(gamePoints, 12);
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The First 5 Players gain 15 points:");
        Arrays.fill(gamePoints, 0 , 5,  27);
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The 6th Player gain 90 points:");
        gamePoints[6] += 90;
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The Game Points in Order");
        Arrays.sort(gamePoints);
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The First 5 Element");
        int[] firstFivePoint = Arrays.copyOf(gamePoints, 5);
        System.out.println(Arrays.toString(firstFivePoint));

        System.out.println("The Last 5 Element");
        int[] lastFivePoint = Arrays.copyOfRange(gamePoints, gamePoints.length - 5 , gamePoints.length);
        System.out.println(Arrays.toString(lastFivePoint));

        if(Arrays.equals(firstFivePoint, lastFivePoint)) {
            System.out.println("The Following players is having same point");
        } else {
            System.out.println("The Following players does not having same point");
        }

        gamePoints[5] = 30;
        Arrays.sort(gamePoints);
        if(Arrays.binarySearch(gamePoints, 30) >= 0) {
            System.out.println("This Player has won the  game");
        } else {
            System.out.println("No player has won the game");
        }
    }
}
