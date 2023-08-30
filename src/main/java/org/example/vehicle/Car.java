package org.example.vehicle;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return doors == car.doors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doors);
    }
}
