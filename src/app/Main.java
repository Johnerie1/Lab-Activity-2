package app;

import contracts.Serviceable;
import devices.Printer;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Vios", 2020, 4);

        Motorcycle moto = new Motorcycle(
            "Yamaha", "Mio", 2022, "Automatic"
        );

        Truck truck = new Truck(
            "Isuzu", "N-Series", 2021, 5.0
        );

        Vehicle[] fleet = {car, moto, truck};

        for (Vehicle v : fleet) {
            v.move();
        }

        Serviceable[] items = {
            car, moto, truck, new Printer()
        };

        for (Serviceable s : items) {
            s.service();
        }
    }
}