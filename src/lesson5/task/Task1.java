package lesson5.task;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[1][0] = 21;
        arr[1][1] = 22;
        int total = 0;

        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr.length; j++) {
                total += arr[i][j];
            }
        }
        System.out.println("Total value is " + total);
    }
}
