package vehicles;

import contracts.Serviceable;

public class Car extends Vehicle implements Serviceable {

    String brand;
    String model;
    int year;
    int doors;

    public Car(String brand, String model, int year, int doors) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println("Car drives on the road.");
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }
}