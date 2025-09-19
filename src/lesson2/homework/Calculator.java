package lesson2.homework;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = keyboard.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = keyboard.nextInt();

        int result;
        boolean valid = false;

        while (!valid) {
            System.out.print("Please enter the operation(+|-|*|/|): ");
            char operation = keyboard.next().charAt(0); //makes sure only first character from the String is captured
            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    System.out.println("Result is: " + result);
                    valid = true;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    System.out.println("Result is: " + result);
                    valid = true;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    System.out.println("Result is: " + result);
                    valid = true;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("Invalid operation! Second number cannot be zero.");
                        break;
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("Result is: " + result);
                        valid = true;
                        break;
                    }
                default:
                    System.out.println("Invalid operation! You can only perform this operations: '+' '-' '*' '/'");
                    break;
            }
        }
    }
}
