package lesson9.task4;

import java.util.Scanner;

public class ExceptionalCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter operator: ");
        String ch = input.nextLine();
        if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
            System.out.println("Great");
        } else{
            throw new OperatorException("Operator Error");
        }
        switch (ch) {
            case "*":
                System.out.println("Correct operator");
                break;
                case "/":
                    System.out.println("Correct operator");
                    break;
                    case "+":
                        System.out.println("Correct operator");
                        break;
                        case "-":
                            System.out.println("Correct operator");
                            break;
        }
    }
}
