package com.inhritance.car;

public abstract class Car {
    public String CarName;
    public int Price;
    public int NoOfGear;
    public int noOfYearService;
    public int TotalMileage;

    public Car(String CarName, int Price, int NoOfGear, int noOfYearService, int TotalMileage) {
        this.CarName = CarName;
        this.Price = Price;
        this.NoOfGear = NoOfGear;
        this.noOfYearService = noOfYearService;
        this.TotalMileage = TotalMileage;
    }

    public void StartEngine() {
        System.out.println("Engine started: ");
    }

    public void GetDescription() {
        System.out.println("Name Of The Car: " +this.CarName);
        System.out.println("Price Of The Car: " +this.Price);
        System.out.println("Gear Count Of The Car: " +this.NoOfGear);
        System.out.println("Total Run Of The Car: " +getNoOfYearService());
    }

    public int getNoOfGear() {
        return NoOfGear;
    }

    public void setNoOfGear(int noOfGear) {
        this.NoOfGear = Math.abs(noOfGear);
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        this.CarName = carName;
    }

    public int getNoOfYearService() {
        return noOfYearService;
    }

    public void setNoOfYearService(int noOfYearService) {
        this.noOfYearService = noOfYearService;
    }
}
