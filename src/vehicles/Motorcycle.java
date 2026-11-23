package vehicles;

import contracts.Serviceable;

public class Motorcycle extends Vehicle implements Serviceable {

    String brand;
    String model;
    int year;
    String transmission;

    public Motorcycle(String brand, String model, int year, String transmission) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.transmission = transmission;
    }

    @Override
    public void move() {
        System.out.println("Motorcycle rides on two wheels.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }
}