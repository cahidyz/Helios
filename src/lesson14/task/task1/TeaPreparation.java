package lesson14.task.task1;

public class TeaPreparation implements Runnable {

    @Override
    public void run() {
        try{
            for(int i = 1; i <= 7 ;i++){
                System.out.println("Tea glasses are  ready to be served.. (" + i + ")");
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tea glasses are ready!");
    }
}
