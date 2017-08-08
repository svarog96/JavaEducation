/**
 * Created on 06.08.17.
 */
public class WaitNotifySynchronizedTest_7A {
    public static void main(String[] args) {
        f();
    }

    public static synchronized void f() {
        Class clazz = WaitNotifySynchronizedTest_7A.class;
        clazz.notify();
    }
}
