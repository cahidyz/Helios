package lesson6.homework;

public class CarPrint {

    /**
     * Prints all cars in a given array.
     */
    public void printAllCars(Car[] cars) {
        System.out.println("\n--- All Cars ---");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    /**
     * Prints only the cars made by manufacturers from a specific country.
     */
    public void printCarsByCountry(String country, Car[] cars) {
        System.out.println("\n--- Cars from " + country + " ---");
        int count = 0;
        for (Car car : cars) {
            if (car.getManufacturer().getCountry().equalsIgnoreCase(country)) {
                System.out.println(car);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No cars found from this country.");
        }
    }

    /**
     * Prints only the cars that match a specific fuel type.
     */
    public void printCarsByFuelType(String fuelType, Car[] cars) {
        System.out.println("\n--- Cars with Fuel Type: " + fuelType + " ---");
        int count = 0;
        for (Car car : cars) {
            if (car.getFuelType().equalsIgnoreCase(fuelType)) {
                System.out.println(car);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No cars found with this fuel type.");
        }
    }
}