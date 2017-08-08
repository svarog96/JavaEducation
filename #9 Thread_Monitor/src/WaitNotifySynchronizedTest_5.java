/**
 * Created on 06.08.17.
 */
public class WaitNotifySynchronizedTest_5 {
    public static void main(String[] args) throws InterruptedException {
        Object ref0 = new Object();
        Object ref1 = new Object();

        synchronized (ref0) {
            synchronized (ref1) {
                ref0.notify();
                ref1.notify();
            }
        }
    }
}
