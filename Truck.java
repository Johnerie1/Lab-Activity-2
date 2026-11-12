public class Truck extends Vehicle implements Serviceable {

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    public void move() {
        System.out.println("A truck moves forward.");
    }

    @Override
    public void service() {
        System.out.println("Truck: Inspect cargo brakes.");
    }
}