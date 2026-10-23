
public class Truck extends Vehicle {

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void printDetails() {
        System.out.println("Truck Information");
        super.printDetails();
    }
}
