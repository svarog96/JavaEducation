/**
 * Created on 08.08.17.
 */
public class InterruptExample_1_interrupted {
        public static void main(String[] args) throws InterruptedException {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread myThread = Thread.currentThread();
                    while (true) {
                        System.out.println(myThread.interrupted());
                        for(long k = 0; k < 1_000_000_000L; k++);
                    }
                }
            });
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        }
}
