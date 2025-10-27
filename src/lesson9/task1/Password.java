package lesson9.task1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = input.next();
        if(password.length() < 6) {
            throw new InvalidPasswordException("Password too short.");
        } else{
            System.out.println("Password is created");
        }
    }
}
