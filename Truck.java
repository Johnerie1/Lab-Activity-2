
public class Truck extends Vehicle {

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void moveForward() {
        System.out.println("A truck moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A truck moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck moves right");
    }
}
