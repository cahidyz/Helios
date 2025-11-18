package lesson13.homework;

import java.util.HashMap;

public class CarRegistration {
    public static void main(String[] args) {
        Car firstCar = new Car("10-AA-82", "Hyundai");
        Car secondCar =  new Car("10-AA-85", "Toyota");
        Car thirdCar = new Car("10-AA-56", "BYD");

        Owner owner1 = new Owner("Tom Brad");
        Owner owner2 = new Owner("Tommy Wilson");
        Owner owner3 = new Owner("Jimmy Winston");

        HashMap<Car, Owner> carOwners = new HashMap<>();
        carOwners.put(firstCar, owner1);
        carOwners.put(secondCar, owner2);
        carOwners.put(thirdCar, owner3);

        for (Car car : carOwners.keySet()) {
            // get the value of owner with the key and assign to iy
            Owner owner = carOwners.get(car);

            System.out.println("Plate: " + car.getPlateNumber());
            System.out.println("Model: " + car.getModel());
            System.out.println("Owner: " + owner.getName());
            System.out.println("--------------------");
        }



    }
}
