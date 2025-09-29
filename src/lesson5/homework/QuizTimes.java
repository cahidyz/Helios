package lesson5.homework;

import java.util.Scanner;

public class QuizTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean trueAnswer1 = false;

        System.out.println("Welcome to the Quiz Times!");
        System.out.println("Today we will conduct a quiz on TV show The Walking Dead.");

        String[][] quizData = new String[5][2];
        quizData[0][0] = "Who is the main character in The Walking Dead?";
        quizData[0][1] = "Rick Grimes";
        quizData[1][0] = "What is the term used for the zombies in the show?";
        quizData[1][1] = "Walker";
        quizData[2][0] = "What profession did Rick Grimes have before the apocalypse?";
        quizData[2][1] = "Police Officer";
        quizData[3][0] = "Who is Daryl's brother?";
        quizData[3][1] = "Merle";
        quizData[4][0] = "Is Glenn Korean or Japanese?";
        quizData[4][1] = "Korean";

        // Question 1
        while(!trueAnswer1) {
            System.out.println(quizData[0][0]);
            System.out.println("A: " + quizData[0][1]);
            System.out.println("B: Daryl Dixon");
            System.out.println("C: Glenn");
            System.out.println("D: Governor");
            System.out.print("Enter your choice: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("A")) {
                System.out.println("Congratulations!");
                trueAnswer1 = true;
            } else {
                System.out.println("Try again.");
            }
        }

        // Question 2
        while(trueAnswer1) {
            System.out.println(quizData[1][0]);
            System.out.println("A: " + quizData[1][1]);
            System.out.println("B: Zombies");
            System.out.println("C: Runners");
            System.out.println("D: Nothing");
            System.out.print("Enter your choice: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("A")) {
                System.out.println("Congratulations!");
                trueAnswer1 = false;
            } else {
                System.out.println("Try again.");
            }
        }

        // Question 3
        while(!trueAnswer1) {
            System.out.println(quizData[2][0]);
            System.out.println("A: Doctor");
            System.out.println("B: Teacher");
            System.out.println("C: Police Officer");
            System.out.println("D: Lawyer");
            System.out.print("Enter your choice: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("C")) {
                System.out.println("Congratulations!");
                trueAnswer1 = true;
            } else {
                System.out.println("Try again.");
            }
        }

        // Question 4
        while(trueAnswer1) {
            System.out.println(quizData[3][0]);
            System.out.println("A: Shane");
            System.out.println("B: Merle");
            System.out.println("C: Glenn");
            System.out.println("D: Abraham");
            System.out.print("Enter your choice: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("B")) {
                System.out.println("Congratulations!");
                trueAnswer1 = false;
            } else {
                System.out.println("Try again.");
            }
        }

        // Question 5
        while(!trueAnswer1) {
            System.out.println(quizData[4][0]);
            System.out.println("A: Japanese");
            System.out.println("B: Korean");
            System.out.println("C: Chinese");
            System.out.println("D: American");
            System.out.print("Enter your choice: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("B")) {
                System.out.println("Congratulations! You've completed the quiz.");
                trueAnswer1 = true;
            } else {
                System.out.println("Try again.");
            }
        }
    }
}