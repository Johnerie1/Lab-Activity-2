public class Car extends Vehicle implements Serviceable {
    int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    public void move() {
        System.out.println("A car moves forward.");
    }

    @Override
    public void service() {
        System.out.println("Car: Check oil and brakes.");
    }
}