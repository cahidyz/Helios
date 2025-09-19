package lesson2.task;
import  java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select your hero(Batman/Flash/Punisher): ");
        String hero = keyboard.nextLine();
        String hero2 = hero.toLowerCase();
        switch (hero2){
            case "batman":
                System.out.println("Your character is Batman");
                break;
            case "flash":
                System.out.println("Your character is Flash");
                break;
            case "punisher":
                System.out.println("Your character is Punisher");
                break;
                default:
                    System.out.println("Sorry, this character is having vacation.");
        }

    }
}
