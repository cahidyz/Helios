package lesson4.task;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        myArray[0] = 15;
        myArray[1] = 22;
        myArray[2] = 44;
        myArray[3] = 46;
        myArray[4] = 38;
        myArray[5] = 25;
        int max = myArray[0];
        int min = myArray[0];

        for(int i = 0; i < myArray.length; i++){
            if(max>myArray[i]){
                max=myArray[i];
            }
            if(min<myArray[i]){
                min=myArray[i];
            }
        }
        System.out.println("Biggest number in array: " + max);
        System.out.println("Smallest number in array: " + min);
    }
}
