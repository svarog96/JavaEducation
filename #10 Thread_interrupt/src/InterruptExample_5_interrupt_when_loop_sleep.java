/**
 * Created on 08.08.17.
 */
public class InterruptExample_5_interrupt_when_loop_sleep {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread myThread = Thread.currentThread();
                while (!myThread.isInterrupted()) {
                    System.out.println("Hellow");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        System.out.println("I interrupted: by");
                        return;
                    }
                }
                System.out.println("I interrupted: by flag");
            }
        });
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
