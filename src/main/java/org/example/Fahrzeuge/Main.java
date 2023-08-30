package org.example.Fahrzeuge;

public class Main {
    public  static  void main(String[] args){
        System.out.println("Vehicles");
        System.out.println("_________");

        Vehicles vehicleone = new Vehicles();
        vehicleone.setBrand("VW");
        vehicleone.setModel("Passat");
        vehicleone.setYearOfManufactoring(1980);
        System.out.println(vehicleone);

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
