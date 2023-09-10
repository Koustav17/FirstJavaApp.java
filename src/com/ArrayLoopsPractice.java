package com;

import java.io.*;
import java.util.*;
public class ArrayLoopsPractice {
    public static void main(String[] args) {
        int[][] LotteryChecking = {
                { 2, 6, 9, 10},
                { 4, 5, 8, 90},
                { 7, 1, 0, 20},
        };
        for (int i = 0; i<LotteryChecking.length; i++) {
            for(int j=0; j<LotteryChecking[i].length; j++) {
                System.out.println(LotteryChecking[i][j] + " ");
            }
            System.out.println();
        }
    }
}
