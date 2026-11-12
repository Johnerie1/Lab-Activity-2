public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Vios", 2020, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Mio", 2022, "Automatic");
        Truck truck = new Truck("Isuzu", "Elf", 2021);
        Printer printer = new Printer();

        // Serviceable Array
        Serviceable[] serviceItems = {
            car, motorcycle, truck, printer
        };

        System.out.println("=== SERVICEABLE ITEMS ===");

        for (Serviceable item : serviceItems) {
            performService(item);
            System.out.println();
        }

        // Vehicle Array
        Vehicle[] vehicles = {
            car, motorcycle, truck
        };

        System.out.println("=== VEHICLE INFORMATION ===");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println();
        }
    }
}