public class Vehicle {
    // Fields
    String brand;
    String model;
    int year;

    // Method 1: displayInfo() prints all three fields in one line
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    // Method 2: calculateAge() returns an int: 2026 - year
    public int calculateAge() {
        return 2026 - year;
    }

    // Method 3: isVintage() returns a boolean: true if age > 25, otherwise false
    public boolean isVintage() {
        return calculateAge() > 25;
    }
}