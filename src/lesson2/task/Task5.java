package lesson2.task;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your score(0-100)");
        int score = keyboard.nextInt();
        if(score >=90 ){
            System.out.println("A");
        } else if(score >=80){
            System.out.println("B");
        } else if(score >=70){
            System.out.println("C");
        }else if(score >=60){
            System.out.println("D");
        }else if(score <= 59){
            System.out.println("F");
        }
    }
}
