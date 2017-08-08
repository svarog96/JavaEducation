package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_4A {
    public static void main(String[] args) throws InterruptedException {
        //A
        Runnable printerA = new PrintRunnable("A", 300);
        Thread threadA = new Thread(printerA);
        threadA.start();
        //B
        Runnable printerB = new PrintRunnable(" B", 500);
        Thread threadB = new Thread(printerB);
        threadB.start();

        threadA.join();
        System.out.println("---");
        threadB.join();
        System.out.println("Buy!");

    }
}
