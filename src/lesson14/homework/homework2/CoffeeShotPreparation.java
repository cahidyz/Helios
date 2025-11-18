package lesson14.homework.homework2;

class CoffeeShotPreparation extends Thread {
    @Override
    public void run() {
        System.out.println("Barista 2: Brewing espresso shot..");
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Barista 2: Espresso shot is ready!");
    }
}
