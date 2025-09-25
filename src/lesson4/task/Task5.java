package lesson4.task;

public class Task5 {
    public static void main(String[] args) {
        int[] myArray={5, 10, 15, 20, 25};
        int totalSum = 0;
        int average = 0;
        for(int i=0;i<myArray.length;i++){
            totalSum+=myArray[i];
            average=totalSum/myArray.length;
        }
        System.out.println("The average is: " + average);
    }
}
