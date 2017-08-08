package producer_consumer;

/**
 * Created on 07.08.17.
 */
public class Consumer implements Runnable {
    private final SingleElementBuffer buffer;

    public Consumer(SingleElementBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while(true){
                int elem = buffer.get();
                System.out.println(elem + " consumed");
            }

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName());
            return;
        }
    }
}
