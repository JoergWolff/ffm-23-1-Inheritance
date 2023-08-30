package org.example.Fahrzeuge;

import java.util.Objects;

public class Vehicles {
    protected String brand;
    protected String model;
    protected  int yearOfManufactoring;

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

    @Override
    public String toString() {
        return "vehicles{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufactoring=" + yearOfManufactoring +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicles vehicles = (Vehicles) o;
        return yearOfManufactoring == vehicles.yearOfManufactoring && Objects.equals(brand, vehicles.brand) && Objects.equals(model, vehicles.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfManufactoring);
    }
}