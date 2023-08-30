package org.example.vehicle;

import java.util.Objects;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int yearOfManufactoring;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufactoring() {
        return yearOfManufactoring;
    }

    public void setYearOfManufactoring(int yearOfManufactoring) {
        this.yearOfManufactoring = yearOfManufactoring;
    }

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int yearOfManufactoring) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufactoring = yearOfManufactoring;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufactoring=" + yearOfManufactoring +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicles = (Vehicle) o;
        return yearOfManufactoring == vehicles.yearOfManufactoring && Objects.equals(brand, vehicles.brand) && Objects.equals(model, vehicles.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfManufactoring);
    }
}
