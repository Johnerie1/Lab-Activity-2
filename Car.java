
public class Car extends Vehicle {
    int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Doors: " + doors);
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A car moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right");
    }
}
