package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_0B {

    public static void main(String[] args) throws InterruptedException {
        for(int k = 0; k < 10; k++) {
            Thread.sleep(240);
            System.out.println("A");
            f();
        }

    }

    public static void f() throws InterruptedException {
        Thread.sleep(260);
        System.out.println(" B");
    }
}
