package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_1A {
    public static void main(String[] args) throws InterruptedException {
        Runnable printer = new PrintRunnable(" B", 250);
        Thread thread = new Thread(printer);
        thread.start();

        for(int k = 0; k < 10; k++){
            Thread.sleep(250);
            System.out.println("A");
        }
    }
}
