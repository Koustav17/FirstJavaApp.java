package com.mathFunction;

public class MathFunctionApp {
    public static void main(String[] args) {
        double temparetureYesterday = -3.4;
        double temparetureToday = -Math.random() * 10;

        System.out.println("Absoulte Tempareture Today:" +Math.abs(temparetureYesterday));
        System.out.println("Min:" +Math.min(temparetureToday, temparetureYesterday));
        System.out.println("Max:" +Math.max(temparetureToday, temparetureYesterday));
        System.out.println("Round:" +Math.round(temparetureToday));
        System.out.println("Ceil:" +Math.ceil(temparetureToday));
        System.out.println("Floor:" +Math.floor(temparetureToday));

        System.out.println("Power:" +Math.pow(temparetureToday, 2));
        System.out.println("Square Root:" +Math.sqrt(Math.abs(temparetureToday)));
    }
}
