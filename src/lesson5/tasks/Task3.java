package lesson5.tasks;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[1][0] = 21;
        arr[1][1] = 22;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
