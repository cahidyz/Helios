package lesson2.homework;
import java.util.Scanner;

public class PublicTransport {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();

        if(age < 18) {
            System.out.println("Your payment for the ticket will be 0.50AZN");
        } else if(age >= 18) {
            System.out.println("Your payment for the ticket will be 1.00AZN");
        }
    }
}
