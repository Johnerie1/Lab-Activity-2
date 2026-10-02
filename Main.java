public class Main {
    public static void main(String[] args) {
       
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2015);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1967);
        Vehicle v3 = new Vehicle("Tesla", "Model 3", 2022);

        Vehicle[] vehicles = {v1, v2, v3};
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Getters -> Brand: " + v.getBrand() + ", Model: " + v.getModel() + ", Year: " + v.getYear());
            System.out.println("Age: " + v.calculateAge() + " | Vintage: " + v.isVintage());
            System.out.println("--------------------------------------------------");
        }

        
        System.out.println("=== Testing setYear and Constructor Validation ===");

        
        boolean r1 = v1.setYear(2000);
        System.out.println("setYear(2000) -> " + r1 + "; year is " + v1.getYear() 
                           + "; age " + v1.calculateAge() + "; vintage " + v1.isVintage());

        
        boolean r2 = v1.setYear(1885);
        System.out.println("setYear(1885) -> " + r2 + "; year remains " + v1.getYear());

        
        boolean r3 = v1.setYear(2027);
        System.out.println("setYear(2027) -> " + r3 + "; year remains " + v1.getYear());

        
        Vehicle invalid1 = new Vehicle("VintageTest", "Old", 1885);
        System.out.println("New vehicle with year 1885 -> Initial year is " + invalid1.getYear());

        
        Vehicle invalid2 = new Vehicle("FutureTest", "New", 2027);
        System.out.println("New vehicle with year 2027 -> Initial year is " + invalid2.getYear());
    }
}