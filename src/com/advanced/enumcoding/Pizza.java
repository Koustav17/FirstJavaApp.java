package com.advanced.enumcoding;

public class Pizza {
    private String name;
    private  PizzaSize pizzaSize;
    private double price;

    public Pizza(String name,  PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = doublePrice();
    }

    private double doublePrice() {
        switch(pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 8.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
}
