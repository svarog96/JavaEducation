/**
 * Created on 08.08.17.
 */
public class InterruptExample_7_interrupt_when_sleep {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("I will sleep");
                    Thread.sleep(Long.MAX_VALUE);
                } catch (InterruptedException e) {
                    System.out.println("I interrupted by exception");
                }
            }
        });
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}
