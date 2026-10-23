
public class Motorcycle extends Vehicle {
    String engineType;

    public Motorcycle(String brand, String model, int year, String engineType) {
        super(brand, model, year);
        this.engineType = engineType;
    }

    @Override
    public void printDetails() {
        System.out.println("Motorcycle Information");
        super.printDetails();
        System.out.println("Engine Type: " + engineType);
    }
}
