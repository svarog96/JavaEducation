/**
 * Created on 06.08.17.
 */
public class WaitNotifySynchronizedTest_3 {
    public static void main(String[] args) throws InterruptedException {
        Object ref = new Object();
        synchronized (ref) {
            ref.wait();
        }
    }
}
