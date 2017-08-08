package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_2B {
    public static void main(String[] args) throws InterruptedException {
        Runnable printer = new PrintRunnable(" B", 1000);
        Thread thread = new Thread(printer);
        thread.start();

        for(int k = 0; k < 10; k++){
            Thread.sleep(250);
            System.out.println("A");
        }

        System.out.println("Start wait");
        thread.join();
        System.out.println("Buy-buy");
    }
}
