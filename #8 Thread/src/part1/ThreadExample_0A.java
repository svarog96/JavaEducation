package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_0A {
    public static void main (String[] args) throws InterruptedException {
        for (int k = 0; k < 10; k++){
            Thread.sleep(250);
            System.out.println("A");
        }
    }
}
