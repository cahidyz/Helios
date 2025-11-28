package lesson16.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private static List<Task> taskList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to HR Task Management System");

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Add New Task");
            System.out.println("2. Show All Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Mark Task as Critical");
            System.out.println("5. Filter (Show Only Urgent)");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewTask();
                    break;
                case 2:
                    listAllTasks();
                    break;
                case 3:
                    updateTaskStatus();
                    break;
                case 4:
                    markAsCritical();
                    break;
                case 5:
                    filterUrgentTasks();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addNewTask() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        System.out.print("Estimated Hours: ");
        double hours = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Select Urgency (ROUTINE, NORMAL, URGENT): ");
        String urgencyStr = scanner.nextLine().toUpperCase();

        try {
            Urgency urgency = Urgency.valueOf(urgencyStr);

            Task newTask = new Task(id, hours, TaskStatus.PENDING, urgency, false);

            taskList.add(newTask);
            System.out.println("Task added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid urgency level entered.");
        }
    }

    private static void listAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }

    private static void updateTaskStatus() {
        System.out.print("Enter Task ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Task foundTask = findTaskById(id);

        if (foundTask != null) {
            System.out.println("Enter New Status (PENDING, IN_PROGRESS, ON_HOLD, COMPLETED, ARCHIVED): ");
            String statusStr = scanner.nextLine().toUpperCase();
            try {
                TaskStatus newStatus = TaskStatus.valueOf(statusStr);
                foundTask.updateStatus(newStatus);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: That status does not exist!");
            }
        } else {
            System.out.println("Task with this ID not found.");
        }
    }

    private static void markAsCritical() {
        System.out.print("Enter Task ID to mark as Critical: ");
        int id = scanner.nextInt();

        Task foundTask = findTaskById(id);

        if (foundTask != null) {
            foundTask.setCritical(true);
            System.out.println("Task marked as CRITICAL!");
        } else {
            System.out.println("Task not found.");
        }
    }

    private static void filterUrgentTasks() {
        System.out.println("Filtering Only URGENT Tasks");
        boolean found = false;
        for (Task task : taskList) {
            if (task.getUrgency() == Urgency.URGENT) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) System.out.println("No Urgent tasks found.");
    }

    private static Task findTaskById(int id) {
        for (Task task : taskList) {
            if (task.getTaskId() == id) {
                return task;
            }
        }
        return null;
    }
}
