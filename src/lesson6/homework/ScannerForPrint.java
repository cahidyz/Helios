package lesson6.homework;

import java.util.Scanner;

public class ScannerForPrint {
    // Create the Scanner once as a class member
    private Scanner scanner;

    // The constructor initializes the Scanner
    public ScannerForPrint() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * This is your method, slightly adjusted to use the class's single scanner.
     * It prompts the user for details and returns a new Manufacturer object.
     */
    public Manufacturer createManufacturer() {
        System.out.print("Enter Manufacturer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Manufacturer Foundation Year: ");
        int foundationYear = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter Manufacturer Country: ");
        String country = scanner.nextLine();
        return new Manufacturer(name, foundationYear, country);
    }

    /**
     * Creates a Car object by asking the user for input.
     * It requires the array of existing manufacturers so the user can choose one.
     */
    public Car createCar(Manufacturer[] existingManufacturers) {
        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        // Let the user pick a manufacturer from the list
        System.out.println("Please select a manufacturer:");
        for (int i = 0; i < existingManufacturers.length; i++) {
            System.out.println((i + 1) + ": " + existingManufacturers[i].getName());
        }
        System.out.print("Enter choice number: ");
        int choice = scanner.nextInt() - 1; // Subtract 1 for array index
        Manufacturer selectedMan = existingManufacturers[choice];

        System.out.print("Enter Production Year: ");
        int prodYear = scanner.nextInt();
        System.out.print("Enter Engine Size (e.g., 2.5): ");
        double engineSize = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Fuel Type (e.g., Petrol): ");
        String fuelType = scanner.nextLine();
        System.out.print("Enter Price: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        return new Car(model, selectedMan, prodYear, engineSize, fuelType, price);
    }

    // A helper method to ask for the number of items to create
    public int getNumberOfItems(String itemType) {
        System.out.print("How many " + itemType + " would you like to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return count;
    }

    // A method to close the scanner when we're done
    public void close() {
        scanner.close();
    }

    public String getString() {
        String s = scanner.nextLine();
        return s;
    }
}