package com.advanced.InnerClass;

import com.advanced.enumcoding.PizzaSize;

class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name,  PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = doublePrice();
    }
    class pizzaSlice {
        public String calculatePizzaSliceArea() {
            switch(pizzaSize) {
                case SMALL:
                default:
                    return "Small slice";
                case MEDIUM:
                    return "Medium slice";
                case LARGE:
                    return "Large slice";
            }
        }
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

    public pizzaSlice cutPizzaSlice() {
        return new pizzaSlice();
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
public class InnerClassApp {
    private static boolean isPizzaReady(int waitedMinutes) {
        class Oven {
            public boolean isPizzaBakedProperly() {
                if(waitedMinutes > 30) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        Oven oven = new Oven();
        return oven.isPizzaBakedProperly();
    }
    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Margarita", PizzaSize.MEDIUM);
        System.out.println("Name: " +firstPizza.getName());
        Pizza secondPizza = new Pizza("Margarita", PizzaSize.MEDIUM) {
            @Override
            public String getName() {
                return "Anonymus";
            }
        };
        System.out.println("Name: " +secondPizza.getName());
        if(isPizzaReady(20)) {
            System.out.println("Pizza is ready");
        } else {
            System.out.println("Pizza is not ready");
        }
        Pizza thirdPizza = new Pizza("Pan Cake", PizzaSize.SMALL);
        Pizza.pizzaSlice pizzaSlice = thirdPizza.cutPizzaSlice();
        System.out.println(pizzaSlice.calculatePizzaSliceArea());
    }
}
