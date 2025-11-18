package lesson14.task.task1;

public class TeaMaker implements Runnable {

    @Override
    public void run() {
        try{
            for(int i = 1; i <= 5 ;i++){
                System.out.println("Tea is brewing.. (" + i + ")");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tea is ready!");
    }
}
