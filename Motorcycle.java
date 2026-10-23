public class Motorcycle extends Vehicle {
    String engineType;
    int numberOfWheels;

    public Motorcycle(String brand, String model, int year,
                      String engineType, int numberOfWheels) {
        super(brand, model, year);
        this.engineType = engineType;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Engine Type: " + engineType);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}