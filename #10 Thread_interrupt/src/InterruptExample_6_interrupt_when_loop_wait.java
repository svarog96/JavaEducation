/**
 * Created on 08.08.17.
 */
public class InterruptExample_6_interrupt_when_loop_wait {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread myThread = Thread.currentThread();
                while (!myThread.isInterrupted()) {
                    System.out.println("Hellow");
                    try {
                        Object lock = new Object();
                        synchronized (lock) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        System.out.println("I interrupted: by exception");
                        return;
                    }
                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
