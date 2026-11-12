public class Motorcycle extends Vehicle implements Serviceable {
    String transmission;

    public Motorcycle(String brand, String model, int year, String transmission) {
        super(brand, model, year);
        this.transmission = transmission;
    }

    public void move() {
        System.out.println("A motorcycle moves forward.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: Inspect tires and brakes.");
    }
}