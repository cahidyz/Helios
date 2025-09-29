package lesson5.tasks;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 15;
        arr[0][1] = 10;
        arr[1][0] = 25;
        arr[1][1] = 20;

        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}