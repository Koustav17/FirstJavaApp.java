package com.collections.LinkList;

import java.util.LinkedList;

public class linkListApp {
    public static void main(String[] args) {
        LinkedList<String> morningRoutine = new LinkedList<>();
        morningRoutine.add("Wake up at 12 o Clock");
        morningRoutine.add("Brushing my Tooth");
        morningRoutine.add("Get ready for walk");
        System.out.println("After inserting items is: " +morningRoutine);
        System.out.println("I completed First element of the List: " +morningRoutine.pollFirst());
        System.out.println("I completed Last element of the List: " +morningRoutine.pollLast());
        System.out.println("After Doing all the oparetion the List " +morningRoutine);
    }
}
