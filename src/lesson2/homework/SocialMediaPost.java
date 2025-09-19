package lesson2.homework;
import java.util.Scanner;

public class SocialMediaPost {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the lengthOfText of your text: ");
        int lengthOfText = keyboard.nextInt();

        System.out.print("Photo included?(true/false): ");
        boolean photoIncluded = keyboard.nextBoolean();

        System.out.print("Enter the number of likes you got: ");
        int numberOfLikes = keyboard.nextInt();

        if(lengthOfText > 100 && numberOfLikes > 500){
            System.out.println("Your post is viral!");
        } else if(photoIncluded && lengthOfText > 50){
            System.out.println("Your post is interesting!");
        } else {
            System.out.println("Your post does not standout!");
        }
    }
}
