public class Main {
    public static void main(String[] args) {
        // Vehicle 1 (Vintage: 2026 - 1995 = 31 years old > 25)
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Toyota";
        vehicle1.model = "Corolla";
        vehicle1.year = 1995;

        // Vehicle 2 (Not vintage: 2026 - 2018 = 8 years old)
        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Honda";
        vehicle2.model = "Civic";
        vehicle2.year = 2018;

        // Vehicle 3 (Not vintage: 2026 - 2023 = 3 years old)
        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Tesla";
        vehicle3.model = "Model 3";
        vehicle3.year = 2023;

        // Testing Vehicle 1
        System.out.println("--- Vehicle 1 ---");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        // Testing Vehicle 2
        System.out.println("--- Vehicle 2 ---");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        // Testing Vehicle 3
        System.out.println("--- Vehicle 3 ---");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}