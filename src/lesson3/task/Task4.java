package lesson3.task;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int ranNum=rand.nextInt(1,10);
        System.out.println(ranNum);
        int failNum =0;
        boolean answerRand = false;

        while (!answerRand){
            System.out.print("Please enter a number between 1 and 10: ");
            int num = input.nextInt();
            if(num==ranNum){
                System.out.println("Congratulations!");
                answerRand = true;
            }else{
                failNum++;
            }

            if(num>ranNum){
                System.out.println("Number is bigger than random chosen number");
            } else {
                System.out.println("Number is less than random chosen number");
            }

            if(failNum==3){
                System.out.println("You are wrong! No more tries!");
                answerRand = true;
            }else{
                System.out.println("Try number: " + failNum + " out of 3");
            }


        }
    }
}
