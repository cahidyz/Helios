package lesson2.homework;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your age: "); //using print here helps cursor to stay in the same line
        int age = keyboard.nextInt();

        double lattePrice = 5.5;
        double espressoPrice = 3;
        double lungoPrice = 3.5;
        double newLattePrice;
        double newEspressoPrice;
        double newLungoPrice;
        double discount;


        if (age < 12) {
            System.out.println("Free drinks for kids!");
            discount = 0;
            newLattePrice = lattePrice * 0;
            newEspressoPrice = espressoPrice * 0;
            newLungoPrice = lungoPrice * 0;
        } else if (age < 18) {
            System.out.println("Student discounts for teenagers(50%)!");
            discount = 0.50;
            newLattePrice = lattePrice - (lattePrice * discount);
            newEspressoPrice = espressoPrice - (espressoPrice * discount);
            newLungoPrice = lungoPrice - (lungoPrice * discount);
        } else {
            System.out.println("We have special offers for other citizens too(10%)!");
            discount = 0.10;
            newLattePrice = lattePrice - (lattePrice * discount);
            newEspressoPrice = espressoPrice - (espressoPrice * discount);
            newLungoPrice = lungoPrice - (lungoPrice * discount);
        }


        System.out.println("Lets look at our coffee menu:");
        System.out.println("1. Latte");
        System.out.println("2. Espresso");
        System.out.println("3. Lungo");

        System.out.print("Enter your choice(1|2|3): ");
        int choice;

        do {
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your order for Latte has been successfully accepted.");
                    System.out.println("You must pay: " + newLattePrice + "$");
                    break;
                case 2:
                    System.out.println("Your order for Espresso has been successfully accepted.");
                    System.out.println("You must pay: " + newEspressoPrice + "$");
                    break;
                case 3:
                    System.out.println("Your order for Lungo has been successfully accepted.");
                    System.out.println("You must pay: " + newLungoPrice + "$");
                    break;
                default:
                    System.out.println("Sorry, our menu is limited right now. Please choose something from the menu or come back later! :)");
                    System.out.print("Enter your choice(1|2|3): ");
                    break;
            }
        } while (choice != 1 &&  choice != 2 && choice != 3);
    }
}
