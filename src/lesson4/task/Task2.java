package lesson4.task;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = {5, 10, 15, 20, 25};
        int totalSum = 0;
        for(int i = 0; i < myArray.length; i++){
            totalSum += myArray[i];
            if(i == myArray.length - 1){
                System.out.println(totalSum);
            }
        }
    }
}
