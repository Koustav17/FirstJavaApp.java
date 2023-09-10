package com.inhritance.car;

public class Audi extends Car{

    public Audi(String CarName, int Price, int NoOfGear, int noOfYearService, int TotalMileage) {
        super(CarName, Price, NoOfGear, noOfYearService, TotalMileage);
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
    }

    public void getMilage() {
        super.getNoOfYearService();
    }

    public void setMilage(int Mileage) {
        super.setNoOfYearService(Mileage);
    }

    public void GetDescription() {
        super.GetDescription();
    }
}
