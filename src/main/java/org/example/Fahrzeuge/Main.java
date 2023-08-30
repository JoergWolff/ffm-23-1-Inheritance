package org.example.Fahrzeuge;

public class Main {
    public  static  void main(String[] args){
        System.out.println("Vehicles");
        System.out.println("_________");

        Vehicles vehicleOne = new Vehicles();
        vehicleOne.setBrand("VW");
        vehicleOne.setModel("Passat");
        vehicleOne.setYearOfManufactoring(1980);
        System.out.println(vehicleOne);

        Car carOne = new Car();
        carOne.setBrand("VW");
        carOne.setModel("Golf");
        carOne.setYearOfManufactoring(2012);
        carOne.setDoors(5);
        System.out.println(carOne);

        Motorbike motorbikeOne = new Motorbike();
        motorbikeOne.setBrand("Suzuki");
        motorbikeOne.setModel("Hayabusa");
        motorbikeOne.setYearOfManufactoring(2013);
        motorbikeOne.setType("racebike");
        System.out.println(motorbikeOne);
    }
}
