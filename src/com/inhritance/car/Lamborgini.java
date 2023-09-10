package com.inhritance.car;

public class Lamborgini extends Car{
    public Lamborgini(String CarName, int Price, int NoOfGear, int noOfYearService, int TotalMileage) {
        super(CarName, Price, NoOfGear, noOfYearService, TotalMileage);
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
    }

    public void GetDescription() {
        super.GetDescription();
    }

    public void getMilage() {
        super.getNoOfYearService();
    }

    public void drive(int mileage) {
        this.TotalMileage = Math.abs(mileage);
    }

    public int TotalRun() {
        return TotalMileage;
    }

    public void setMilage(int Mileage) {
        super.setNoOfYearService(Mileage);
    }
}
