package lesson2.task;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter something between 0-23");
        int number = keyboard.nextInt();
        if(number >= 6 && number <= 11){
            System.out.println("Good Morning.");
        } else if(number >= 12 && number <=17){
            System.out.println("Good evening.");
        } else if(number >= 18 && number <=22){
            System.out.println("Have a nice day.");
        } else{
            System.out.println("Good Night!");
        }
    }
}
