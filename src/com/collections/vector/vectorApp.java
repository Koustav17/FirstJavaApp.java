package com.collections.vector;

import java.util.Vector;

public class vectorApp {
    public static void main(String[] args) {
        Vector<String> toDoList = new Vector<>(2, 7);
        System.out.println("Initial Cpacity Of Vector: " +toDoList.capacity());
        toDoList.add("Going To Market");
        toDoList.add("Brought Fish");
        toDoList.add("Return To Home");
        toDoList.add("Give Bike To Servicing");
        System.out.println("After adding element capacity  of Vector: "+ toDoList.capacity());
        System.out.println("Size of the vector: "+ toDoList.size());
        System.out.println("First element of ToDolist: "+ toDoList.firstElement());
        System.out.println("Last element of ToDolist: "+ toDoList.lastElement());
        toDoList.removeElementAt(3);
        System.out.println("---------------------------------------------");
        for(String todo: toDoList) {
            System.out.println("Item of ToDoList: " +todo);
        }
        System.out.println("After Delete of Items Deleted: "+toDoList);
    }
}
