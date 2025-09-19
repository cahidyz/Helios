package lesson2.homework;
import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the movie genre you would like to watch(Action/Comedy/Drama/Animation): ");
        String genre = keyboard.nextLine();

        System.out.print("Please enter the day of the week you would like to visit our cinema: ");
        String day = keyboard.nextLine();

        System.out.print("Please enter your age: ");
        int age = keyboard.nextInt();

        int totalPrice = 0;
        String finalCalculation = "Calculation: ";
        String genreLower = genre.toLowerCase();

        if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Saturday")) {
            totalPrice += 2;
            finalCalculation += day +  "(2)" + " - ";
        }

        if(age<18){
            totalPrice -= 2;
            finalCalculation += "age" + "(2)" + " + ";
        } else if(age<=25){
            totalPrice -= 5;
            finalCalculation += "age" + "(5)" + " + ";
        }

        switch(genreLower) {
            case "action" , "drama":
                totalPrice += 12;
                finalCalculation += genreLower + "(12)" ;
                break;
            case "comedy":
                totalPrice += 10;
                break;
            case "animation":
                totalPrice += 8;
                break;
            default:
                totalPrice += 10;
                break;
        }
        System.out.println("Your total ticket price is: " + totalPrice + "AZN");
        System.out.println(finalCalculation + " = " + totalPrice);
    }
}
