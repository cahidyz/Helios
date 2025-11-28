package lesson16.task;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "15";
        String str2 = "5";

        System.out.println("Original Strings: " + str1 + " and " + str2);

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int sum = num1 + num2;
        System.out.println("Sum (int): " + sum);

        String sumString = Integer.toString(sum);

        System.out.println("Result as String: " + sumString);
    }
}
