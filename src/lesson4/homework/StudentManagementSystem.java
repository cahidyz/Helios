package lesson4.homework;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Student Management System!");
        System.out.print("Enter number of students: ");
        int numOfStudents = input.nextInt();
        String[] listOfNames = new String[numOfStudents];
        char[] gradesLetter = new  char[numOfStudents];
        boolean[] status = new boolean[numOfStudents];
        int[] grades = new int[numOfStudents];
        int[] ages = new int[numOfStudents];

            for(int i = 0; i < numOfStudents; i++){
                System.out.print("Enter student's name: ");
                listOfNames[i] = input.next();

                // helps us to eliminate ages that are negative and gives feedback to user
                while(ages[i] <= 0) {
                    System.out.print("Enter student's age: ");
                    ages[i] = input.nextInt();
                    if (ages[i] <= 0){
                        System.out.println("Invalid age.");
                    }
                }
                //default value of grades[i] won't work here
                //we should initialize grades[i] to a value that is true for given condition
                //this way loop can run and ask user to assign new value
                grades[i] = -1;
                while(grades[i] < 0 || grades[i] > 100) {
                    System.out.print("Enter student's grade: ");
                    grades[i] = input.nextInt();
                    if(grades[i] < 0 || grades[i] > 100){
                        System.out.println("Invalid grade.");
                    }
                }

            if (grades[i] >= 90) {
                gradesLetter[i] = 'A';
            } else if (grades[i] >= 80) {
                gradesLetter[i] = 'B';
            } else if (grades[i] >= 70) {
                gradesLetter[i] = 'C';
            } else if (grades[i] >= 60) {
                gradesLetter[i] = 'D';
            } else {
                gradesLetter[i] = 'F';
            }
            // ternary operator checks if student passed or not
            // another way to check this: boolean passed = (gradesLetter[i] >= 60 && grades[i] <= 100);
            // it's like using if inside declaring of boolean
            // if grade value is beyond grading limits(0-100) it will return false
            status[i] = (grades[i] >= 60 && grades[i] <= 100) ? true : false;
        }

        int choice;
        do {
            System.out.println("-----------------------------");
            System.out.println("1. Show all students");
            System.out.println("2. Show statistics");
            System.out.println("3. Search by name");
            System.out.println("4. Search by age range");
            System.out.println("5. Search by test status");
            System.out.println("6. Sorting by grade");
            System.out.println("0. Exit");
            System.out.println("-----------------------------");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-----------------------------");
                    for (int i = 0; i < numOfStudents; i++) {
                        System.out.println("Name: " + listOfNames[i]);
                        System.out.println("Age: " + ages[i]);
                        System.out.println("Grade: " + grades[i]);
                        System.out.println("Grade by letter: " + gradesLetter[i]);
                        System.out.println("Status: " + ((status[i]) ? "Passed" : "Failed"));
                        System.out.println("-----------------------------");
                    }
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    // class average grade
                    int total = 0;
                    for (int nums : grades) {
                        total += nums;
                    }
                    int average = total / grades.length;
                    System.out.println("Class average is: " + average);
                    // class lowest and highest grade
                    int min = grades[0];
                    int max = grades[0];
                    for(int i = 0; i < numOfStudents; i++){
                      if(grades[i] < min){
                          min = grades[i];
                      }
                      if(grades[i] > max){
                          max = grades[i];
                      }
                    }
                    System.out.println("Minimum grade is: " + min);
                    System.out.println("Maximum grade is: " + max);
                    // number of passed/failed students
                    int totalPassed = 0;
                    int totalFailed = 0;
                    for(int i = 0; i < numOfStudents; i++){
                        if(status[i]){
                            totalPassed++;
                        } else {
                            totalFailed++;
                        }
                    }
                    if(totalPassed > 0){
                        System.out.println("Total passed: " + totalPassed);
                    } else {
                        System.out.println("No one passed the exam.");
                    }
                    if(totalFailed > 0){
                        System.out.println("Total failed: " + totalFailed);
                    } else{
                        System.out.println("No one failed the exam.");
                    }
                    //average age
                    int totalAge = 0;
                    for ( int i = 0; i < numOfStudents; i++){
                        totalAge += ages[i];
                    }
                    average = totalAge / numOfStudents;
                    System.out.println("Average age is: " + average);
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.print("Enter student name: ");
                    String searchName = input.next();
                    System.out.println("-----------------------------");
                    boolean studentFound = false;
                    for (int i = 0; i < numOfStudents; i++) {
                        if(searchName.equalsIgnoreCase(listOfNames[i])){
                            studentFound = true;
                            System.out.println("Student found!");
                            System.out.println("Displaying results..");
                            System.out.println("-----------------------------");
                            System.out.println("Name: " + listOfNames[i]);
                            System.out.println("Age: " + ages[i]);
                            System.out.println("Grade: " + grades[i]);
                            System.out.println("Grade by letter: " + gradesLetter[i]);
                            System.out.println("Status: " + ((status[i]) ? "Passed" : "Failed"));
                            System.out.println("-----------------------------");
                        }
                        if (studentFound == false) {
                            System.out.println("Student not found!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("-----------------------------");
                    System.out.print("Enter lowest age: ");
                    int lowestAge = input.nextInt();
                    System.out.print("Enter highest age: ");
                    int highestAge = input.nextInt();
                    System.out.println("-----------------------------");
                    for (int i = 0; i < numOfStudents; i++) {
                        if(lowestAge <= ages[i] && ages[i] <= highestAge){
                            System.out.println("Student found!");
                            System.out.println("Displaying results..");
                            System.out.println("-----------------------------");
                            System.out.println("Name: " + listOfNames[i]);
                            System.out.println("Age: " + ages[i]);
                            System.out.println("Grade: " + grades[i]);
                            System.out.println("Grade by letter: " + gradesLetter[i]);
                            System.out.println("Status: " + ((status[i]) ? "Passed" : "Failed"));
                            System.out.println("-----------------------------");
                        } else {
                            System.out.println("Could not find any student within the given range.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("-----------------------------");
                    System.out.println("1. Show only passed students");
                    System.out.println("2. Show only failed students");
                    System.out.println("-----------------------------");
                    System.out.print("Enter your choice: ");
                    int statusChoice = input.nextInt();
                    System.out.println("-----------------------------");
                    // if statusChoice is indeed 1 it will return true otherwise false
                    boolean statusSearch = statusChoice == 1;
                    for (int i = 0; i < numOfStudents; i++) {
                        if(status[i] && statusSearch){
                            System.out.println("Student found!");
                            System.out.println("Displaying results..");
                            System.out.println("-----------------------------");
                            System.out.println("Name: " + listOfNames[i]);
                            System.out.println("Age: " + ages[i]);
                            System.out.println("Grade: " + grades[i]);
                            System.out.println("Grade by letter: " + gradesLetter[i]);
                            System.out.println("Status: " + ((status[i]) ? "Passed" : "Failed"));
                            System.out.println("-----------------------------");
                        } else if (!status[i] && !statusSearch) {
                            System.out.println("Student found!");
                            System.out.println("Displaying results..");
                            System.out.println("-----------------------------");
                            System.out.println("Name: " + listOfNames[i]);
                            System.out.println("Age: " + ages[i]);
                            System.out.println("Grade: " + grades[i]);
                            System.out.println("Grade by letter: " + gradesLetter[i]);
                            System.out.println("Status: " + ((status[i]) ? "Passed" : "Failed"));
                            System.out.println("-----------------------------");
                        } else {
                            System.out.println("Could not find any student within the given status.");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("-----------------------------");
                    System.out.println("Sort students by grade:");
                    System.out.println("1. high to low");
                    System.out.println("2. low to high");
                    System.out.print("Enter your choice: ");
                    int sortChoice = input.nextInt();
                    System.out.println("-----------------------------");
                    // used selection sort algorithm for sorting
                    for (int i = 0; i < numOfStudents - 1; i++) {
                        for (int j = i + 1; j < numOfStudents; j++) {
                            // high to low
                            if (sortChoice == 1) {
                                if (grades[i] < grades[j]) {
                                    int holdGrade = grades[i];
                                    grades[i] = grades[j];
                                    grades[j] = holdGrade;

                                    String holdName = listOfNames[i];
                                    listOfNames[i] = listOfNames[j];
                                    listOfNames[j] = holdName;

                                    int holdAge = ages[i];
                                    ages[i] = ages[j];
                                    ages[j] = holdAge;

                                    char holdLetter = gradesLetter[i];
                                    gradesLetter[i] = gradesLetter[j];
                                    gradesLetter[j] = holdLetter;

                                    boolean holdStatus = status[i];
                                    status[i] = status[j];
                                    status[j] = holdStatus;
                                }
                                // low to high
                            } else if (sortChoice == 2) {
                                if (grades[i] > grades[j]) {
                                    // swap everything
                                    int holdGrade = grades[i];
                                    grades[i] = grades[j];
                                    grades[j] = holdGrade;

                                    String holdName = listOfNames[i];
                                    listOfNames[i] = listOfNames[j];
                                    listOfNames[j] = holdName;

                                    int holdAge = ages[i];
                                    ages[i] = ages[j];
                                    ages[j] = holdAge;

                                    char holdLetter = gradesLetter[i];
                                    gradesLetter[i] = gradesLetter[j];
                                    gradesLetter[j] = holdLetter;

                                    boolean holdStatus = status[i];
                                    status[i] = status[j];
                                    status[j] = holdStatus;
                                }
                            }
                        }
                    }
                    for (int i = 0; i < numOfStudents; i++) {
                        System.out.println("Name: " + listOfNames[i]);
                        System.out.println("Age: " + ages[i]);
                        System.out.println("Grade: " + grades[i]);
                        System.out.println("Grade by letter: " + gradesLetter[i]);
                        System.out.println("Status: " + (status[i] ? "Passed" : "Failed"));
                        System.out.println("-----------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Closing program...");
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        } while (choice != 0);
    }
}