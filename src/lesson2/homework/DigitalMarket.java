package lesson2.homework;
import java.util.Scanner;

public class DigitalMarket {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Provide the price for book: ");
        double bookPrice = keyboard.nextDouble();

        System.out.print("Provide the price for notebook: ");
        double notebookPrice = keyboard.nextDouble();

        double totalPrice = bookPrice + notebookPrice;

        System.out.println("Total price for your shopping is: " + totalPrice + "$");

        if(totalPrice > 50){
            System.out.println("Good news! We are offering free delivery for payments over 50$");
        }
    }
}
