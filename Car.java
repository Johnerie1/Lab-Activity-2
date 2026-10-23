public class Car extends Vehicle {
    int numberOfWheels;

    public Car(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}