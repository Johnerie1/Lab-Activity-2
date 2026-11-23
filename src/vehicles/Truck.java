package vehicles;

import contracts.Serviceable;

public class Truck extends Vehicle implements Serviceable {

    String brand;
    String model;
    int year;
    double capacity;

    public Truck(String brand, String model, int year, double capacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
    }

    @Override
    public void move() {
        System.out.println("Truck transports cargo.");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }
}