package lesson3.task;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In this task i will try to understand how much 'a' is included in the word");
        System.out.print("Write your word: ");
        String word = input.next();
        int count = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a'){
                count++;
                System.out.println("Number of a's included in word: " + count);
            }
        }


    }
}
