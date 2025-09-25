package lesson3.homework;
import java.util.Scanner;

public class BusPaymentSystem {
    public static void main(String[] args) {
        double busPayment = 0.7;
        boolean busPermit = true;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the BusPayment System.");
        System.out.println("We can grant you free access if you are using this card for the first time.");
        System.out.println("-----------------------------------------------" +
                "----------------------------");
        System.out.print("Enter wallet balance: ");
        double wallet = input.nextDouble();

        do{
            count++;
            System.out.println("Entry number: " + count);
            System.out.println("You are entering bus...");
            System.out.println("Have a nice trip!");
            if(count == 1){
                System.out.println("New balance: " + wallet +"AZN");
            } else {
                wallet = wallet - busPayment;
                System.out.println("New balance: " + wallet +"AZN");
            }
            if(busPayment > wallet){
                System.out.print("Refill wallet balance: ");
                double newWallet = input.nextDouble();
                wallet = newWallet + wallet;
                System.out.println("Your current balance is: " + wallet);
                if(busPayment > wallet) busPermit = false;
            }
        }while(busPermit);
        System.out.println("Sorry, you had to update your balance.");
    }
}
