/**
 * Created on 06.08.17.
 */
public class WaitNotifySynchronizedTest_6A {
    public static void main(String[] args) {
        new WaitNotifySynchronizedTest_6A().f();
    }
    public synchronized void f() {
        this.notify();
    }
}
