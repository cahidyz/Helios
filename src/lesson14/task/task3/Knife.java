package lesson14.task.task3;

public class Knife implements Runnable {
    String name;
    final Object knifeLock;

    public Knife(String name, Object knifeLock) {
        this.name = name;
        this.knifeLock = knifeLock;
    }


    @Override
    public void run() {
        synchronized (knifeLock){
        System.out.println(name + ", is waiting to start.");
        try {
            Thread.sleep(1000);
            System.out.println(name + ", starts to chop vegetables.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        System.out.println(name + ", have done the job.");
    }

}
