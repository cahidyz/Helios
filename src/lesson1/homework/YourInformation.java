package lesson1.homework;

import java.util.Scanner;

public class YourInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your height: ");
        double height = input.nextDouble();
        System.out.println("Hello, " + name + " !" + "Your age is " + age + "and you height is" + height  );
    }
}
