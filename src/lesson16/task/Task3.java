package lesson16.task;

import java.util.Scanner;

public class Task3 {
    public enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String input = scanner.nextLine();

        try {
            WeekDay day = WeekDay.valueOf(input.toUpperCase());

            switch (day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("Today is a workday.");
                    break;

                case SATURDAY:
                case SUNDAY:
                    System.out.println("Today is the weekend.");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid day entered!");
        }
    }
}
