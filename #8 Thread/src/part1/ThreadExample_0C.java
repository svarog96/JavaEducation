package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_0C {
    public static void main(String[] args) throws InterruptedException {
        for(int k = 0; k < 10; k++) {
            Thread.sleep(240);
            System.out.println("A");
        }
        new PrintRunnable(" B", 260).run();
    }
}
