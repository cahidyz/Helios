package lesson6.homework;

import java.util.Scanner;

public class ScannerForPrint {
    String name;
    int foundationYear;
    String country;
    String model;
    int modelYear;
    int modelEngineSize;
    String modelFuelType;
    int price;
    Car car;
    Manufacturer manufacturer;
    boolean carGo = false;


    void scannerTime(){
        while(!carGo){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the car's manufacturer name: ");
        String name = scan.nextLine();
        System.out.println("Enter the car's manufacturer foundation year: ");
        int foundationYear = scan.nextInt();
        System.out.println("Enter the car's manufacturer origin country: ");
        String country = scan.nextLine();
        System.out.println("Enter the car's model: ");
        String model = scan.nextLine();
        System.out.println("Enter the car's production year: ");
        int modelYear = scan.nextInt();
        System.out.println("Enter the car's engine size: ");
        int modelEngineSize = scan.nextInt();
        System.out.println("Enter the car's fuel type: ");
        String modelFuelType = scan.nextLine();
        System.out.println("Enter the car's price: ");
        int price = scan.nextInt();
        Manufacturer manufacturer = new Manufacturer(name, foundationYear, country);
        Car car = new Car(model, manufacturer, modelYear, modelEngineSize, modelFuelType, price);
        System.out.println("Do you want to enter new car?(true/false)");
        boolean newCar = scan.nextBoolean();
        if(!newCar){
            carGo = true;
        }
        }
    }
}
