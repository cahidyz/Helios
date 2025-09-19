package lesson2.task;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please the name of pizza: ");
    String pizza = keyboard.nextLine();
    if(pizza.equalsIgnoreCase("Pepperoni")){
        System.out.println("Good choice");
    } else if(pizza.equalsIgnoreCase("Sausage")){
        System.out.println("Bad choice");
    } else {
        System.out.println("We do not serve that.");
    }
    }
}
