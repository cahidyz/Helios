package lesson6.homework;

public class CarPrint {

    void printManufacturers(Manufacturer[] manufacturers) {
        System.out.println("=== Manufacturer Info ===");
        for (Manufacturer m : manufacturers) {
            System.out.println(m);
        }
        System.out.println();
    }

    void printCar(Car[] cars) {
        System.out.println("=== Car Catalog ===");
        for (Car c : cars) {
            System.out.println(c);
        }
        System.out.println();
    }

    void printWithFuelType(String fuelType, Car[] cars) {
        System.out.println("=== " + fuelType + " Cars ===");
        for (Car car : cars) {
            if (car.getFuelType().equalsIgnoreCase(fuelType)) {
                System.out.println(car);
            }
        }
        System.out.println();
    }

    void printWithCountry(String country, Car[] cars) {
        System.out.println("=== " + country + " Manufacturer Cars ===");
        for (Car car : cars) {
            if (car.getCountry().equalsIgnoreCase(country)) {
                System.out.println(car);
            }
        }
        System.out.println();
    }
}
