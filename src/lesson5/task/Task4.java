package lesson5.task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] str = new String[2][2];
        str[0][0] = "apple";
        str[0][1] = "milk";
        str[1][0] = "banana";
        str[1][1] = "yogurt";
        boolean found = false;
        int count = 0;

        System.out.print("Please enter what you are looking for: ");
        String lookingFor = input.next();

        for (int i = 0; i < str.length; i++){
            for (int j = 0; j < str[i].length; j++){
                if(str[i][j].equalsIgnoreCase(lookingFor)){
                    System.out.println("Here you go, i found it: " + str[i][j]);
                    found = true;
                }
            }
            if(found == false && count==0){
                System.out.println("Sorry, we dont have that.");
                count++;
            }
        }
    }
}

