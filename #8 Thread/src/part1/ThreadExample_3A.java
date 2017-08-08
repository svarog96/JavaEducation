package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_3A {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        thread.join();
        //dead Lock убьёт сам себя...поток main ждёт завершения самого себя
    }
}
