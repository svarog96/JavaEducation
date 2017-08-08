/**
 * Created on 08.08.17.
 */
public class InterruptExample_2_isInterrupted_while {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread myThread = Thread.currentThread();
                while (!myThread.isInterrupted()) {
                    System.out.println("Hellow");
                    for (long k = 0; k < 1_000_000_000L; k++);
                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
