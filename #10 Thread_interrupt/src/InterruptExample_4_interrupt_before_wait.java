/**
 * Created on 08.08.17.
 */
public class InterruptExample_4_interrupt_before_wait {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().interrupt();
        try {
            Object lock = new Object();
            synchronized (lock) {
                lock.wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted by exception");
        }
    }
}
