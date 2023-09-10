package com.advanced.enumcoding;

public class pizzaApp {
    public static void main(String[] args) {
        System.out.println("Available Size:");
        for(PizzaSize pizzaSize: PizzaSize.values()) {
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }
        System.out.println("");
        Pizza pizzaOrder = new Pizza("Margarita", PizzaSize.LARGE);
        System.out.println("I ordered following Pizza");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Price $: " + pizzaOrder.getPrice());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
    }
}
