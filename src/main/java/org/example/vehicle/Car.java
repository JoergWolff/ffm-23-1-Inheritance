package org.example.vehicle;

public class Car extends Vehicle {

    protected int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Car() {
    }

    public Car(String brand, String model, int yearOfManufactoring, int doors) {
        super(brand, model, yearOfManufactoring);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufactoring=" + yearOfManufactoring +
                '}';
    }


}
