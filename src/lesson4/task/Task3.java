package lesson4.task;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = {25, 10, 20, 15, 25};

        System.out.println("Before sorting: ");
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Index: " + i + " -> " + myArray[i]);
        }

        Arrays.sort(myArray);

        System.out.println();
        System.out.println("After sorting: ");
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Index: " + i + " -> " + myArray[i]);
        }
    }
}
