package org.example.vehicle;

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
}
