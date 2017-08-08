package producer_consumer;

/**
 * Created on 07.08.17.
 */
public class _0_SingleProducerExample_1x1 {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(1, 1000, buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}
