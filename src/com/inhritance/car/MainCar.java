package com.inhritance.car;

public class MainCar {
    public int totalKmRun;
    public static void main(String[] args) {
        Audi audi = new Audi("Audi", 18000, 5, 2000 , 34);
        System.out.println();
        audi.StartEngine();
        audi.setMilage(900000);
        System.out.println("The car name is: " +audi.getCarName());
        System.out.println("The Price of the Audi is:" +audi.Price);
        System.out.println("Total Run Of The Audi is:" + audi.getNoOfYearService());
        audi.setNoOfGear(9);
        System.out.println("The Gear of the Audi is:" +audi.getNoOfGear());
        System.out.println("----------------------------------------------");

        Lamborgini lamborgini = new Lamborgini("Lamborgini", 6700, 3, 9000, 17);
        lamborgini.StartEngine();
        lamborgini.setMilage(100000);
        lamborgini.setNoOfGear(4);
        lamborgini.setMilage(160);
        System.out.println("The car name is: " +lamborgini.getCarName());
        System.out.println("Total run of lamborgini is : " +lamborgini.TotalRun());
        System.out.println("Total Year Of The Lamborgini is:" + lamborgini.getNoOfYearService());
        System.out.println("The Price of the Lamborgini is:" +lamborgini.Price);
        System.out.println("The Gear of the lamborgini is:" +lamborgini.getNoOfGear());
    }
}
