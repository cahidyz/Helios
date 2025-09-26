package lesson4.task;

public class Task7 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[1][0] = 21;
        arr[1][1] = 22;
        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Max Value : " + max);
        System.out.println("Min Value : " + min);
    }
}
