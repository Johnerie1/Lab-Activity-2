
public class Main {

    static void printDetails(Vehicle vehicle) {
        vehicle.printDetails();
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Vios", 2020, 4);
        Truck truck = new Truck("Isuzu", "Elf", 2021);
        Motorcycle motor = new Motorcycle("Yamaha", "Mio", 2022, "Automatic");

        // DEMO 1: Parent Reference
        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = car;
        vehicle.printDetails();

        vehicle = truck;
        vehicle.printDetails();

        vehicle = motor;
        vehicle.printDetails();

        // DEMO 2: Method Parameter
        System.out.println("\n=== 2. Method Parameter ===");

        printDetails(car);
        printDetails(truck);
        printDetails(motor);

        // DEMO 3: Polymorphic Array
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {car, truck, motor};

        for (Vehicle v : vehicles) {
            v.printDetails();
            System.out.println();
        }
    }
}
