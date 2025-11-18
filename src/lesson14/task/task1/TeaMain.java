package lesson14.task.task1;

public class TeaMain {
    public static void main(String[] args) {
        Thread teaMaker = new Thread(new TeaMaker());
        Thread teaPreparation = new Thread(new TeaPreparation());

        System.out.println("Tea Party starts now..");

        teaMaker.start();
        teaPreparation.start();
    }
}
