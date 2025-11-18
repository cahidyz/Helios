package lesson14.task.task2;

public class AtmQueue {
    public static void main(String[] args) {
        Thread queueMember = new Thread(new QueueMember("Jason"));
        Thread queueMember2 = new Thread(new QueueMember("Jonathan"));
        Thread queueMember3 = new Thread(new QueueMember("James"));

        System.out.println("ATM line starts from here..!");

        try {
            queueMember.start();
            queueMember.join();
            queueMember2.start();
            queueMember2.join();
            queueMember3.start();
            queueMember3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All the members of queue withdrew their money and left ATM line..!");
    }
}
