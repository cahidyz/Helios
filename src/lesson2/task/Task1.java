package lesson2.task;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = keyboard.nextInt();
        if(18 <= age){
            System.out.println("Permission given");
        } else {
            System.out.println("Sorry, you are not allowed");
        }
    }
}
