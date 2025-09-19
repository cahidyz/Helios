package lesson3.task;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 51; i++) {
            int result = i % 2;
            if(i==0){
                continue;
            }
            if(result == 0){
                System.out.println(i);
            }
        }
    }
}
