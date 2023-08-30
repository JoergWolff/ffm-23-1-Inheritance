package org.example.vehicle;

import java.util.Objects;

public class Motorbike extends Vehicle {

    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Motorbike() {
    }

    public Motorbike(String brand, String model, int yearOfManufactoring, String type) {
        super(brand, model, yearOfManufactoring);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "type='" + type + '\'' +
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
        Motorbike motorbike = (Motorbike) o;
        return Objects.equals(type, motorbike.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
