package lesson14.task.task2;

public class QueueMember implements Runnable {
    String name;

    public QueueMember(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + ", withdraws cash.");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + ", leaves the queue.");
    }

}
