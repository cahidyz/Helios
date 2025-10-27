package lesson6.homework;

public class CarSystem {

    public static void main(String[] args) {
        ScannerForPrint inputHandler = new ScannerForPrint();
        CarPrint carPrinter = new CarPrint();

        // --- Create Manufacturers ---
        int numManufacturers = inputHandler.getNumberOfItems("manufacturers");
        Manufacturer[] manufacturers = new Manufacturer[numManufacturers];

        for (int i = 0; i < manufacturers.length; i++) {
            System.out.println("\n--- Entering Manufacturer #" + (i + 1) + " ---");
            manufacturers[i] = inputHandler.createManufacturer();
        }

        // --- Create Cars ---
        int numCars = inputHandler.getNumberOfItems("cars");
        Car[] cars = new Car[numCars];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("\n--- Entering Car #" + (i + 1) + " ---");
            cars[i] = inputHandler.createCar(manufacturers);
        }

        // --- Print Results ---
        System.out.println("\n--- Data Entry Complete! ---");
        System.out.println("\n--- All Manufacturers ---");
        for (Manufacturer m : manufacturers) {
            System.out.println(m);
        }

        System.out.println("\n--- All Cars ---");
        for (Car c : cars) {
            System.out.println(c);
        }

        // --- Print Filtered Results ---
        System.out.println("\n--- Now let's filter the results ---");
        System.out.print("Enter a country to filter by: ");
        String countryFilter = inputHandler.getString();
        carPrinter.printCarsByCountry(countryFilter, cars);
        System.out.println();
        System.out.print("Enter a fuel type to filter by: ");
        String fuelFilter = inputHandler.getString();
        carPrinter.printCarsByFuelType(fuelFilter, cars);

        // --- Cleanup ---
        inputHandler.close();
    }
}