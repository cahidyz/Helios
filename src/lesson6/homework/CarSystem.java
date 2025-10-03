package lesson6.homework;

import java.util.Scanner;

public class CarSystem {
    public static void main(String[] args) {
    CarPrint carPrint = new CarPrint();
    ScannerForPrint scan = new ScannerForPrint();
    scan.scannerTime();


    Manufacturer manufacturer = new Manufacturer("Mercedes", 1926, "Germany");
    Car mercedesE = new Car("E-Class", manufacturer, 2015, 3.2, "Petrol", 50000);
    Car mercedesC = new Car("C-Class", manufacturer, 2012, 2.2, "Petrol", 30000);
    Manufacturer manufacturer1 = new Manufacturer("BYD", 1995, "China");
    Car byd = new Car("ATTO3", manufacturer1, 2020, 2.1, "Electrical", 25000);

    Car[] car = new Car[3];
    car[0] = mercedesE;
    car[1] = mercedesC;
    car[2] = byd;

    Manufacturer[] man = new Manufacturer[2];
    man[0] = manufacturer;
    man[1] = manufacturer1;

    carPrint.printManufacturers(man);

    carPrint.printCar(car);

    carPrint.printWithFuelType("Petrol", car);

    carPrint.printWithCountry("Germany", car);
    }
}