/**
 * Created on 08.08.17.
 */
@Deprecated
public class InterruptExample_11_suspend_while {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello!");
                    for(long k = 0; k < 1_000_000_000L; k++);
                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        thread.suspend();
        thread.sleep(1000);
        thread.resume();
    }
}
