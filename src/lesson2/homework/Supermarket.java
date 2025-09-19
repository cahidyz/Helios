package lesson2.homework;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Supermarket's brand new app!");
        System.out.print("Please enter the name of the product you want to buy(milk/bread/egg): ");
        String productName = keyboard.next(); //next reads only first word, while nextLine reads whole line

        System.out.print("Please enter how many numbers of " + productName + " you want to buy: ");
        int productNumber = keyboard.nextInt();

        double milkPrice = 2.50;
        double breadPrice = 1.20;
        double eggPrice = 0.30;
        double targetPrice = 0;
        double discount5 = 0.02;
        double discount10 = 0.05;

        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + productNumber);

        if(productName.equalsIgnoreCase("milk") ) {
            targetPrice = milkPrice * productNumber;
            System.out.println("Initial cost: " + targetPrice);
        } else if(productName.equalsIgnoreCase("bread") ) {
            targetPrice = breadPrice * productNumber;
            System.out.println("Initial cost: " + targetPrice);
        }  else if(productName.equalsIgnoreCase("egg") ) {
            targetPrice = eggPrice * productNumber;
            System.out.println("Initial cost: " + targetPrice);
        }

        if (targetPrice >= 5 && targetPrice < 10) {
            double discountPrice = targetPrice * discount5;
            System.out.println("Discount offer: 5% (" + discountPrice + ")");
            double finalCost = targetPrice - discountPrice;
            System.out.println("Final cost: " + finalCost);
        } else if(targetPrice >= 10) {
            double discountPrice = targetPrice * discount10;
            System.out.println("Discount offer: 10% (" + discountPrice + ")");
            double finalCost = targetPrice - discountPrice;
            System.out.println("Final cost: " + finalCost);
        }

    }
}
