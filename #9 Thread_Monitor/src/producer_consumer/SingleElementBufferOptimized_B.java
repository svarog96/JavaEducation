package producer_consumer;

/**
 * Created on 08.08.17.
 * Утверждение - в wait-set одновременно могут находиться и производители и потребители
 */
public class SingleElementBufferOptimized_B {
    private Integer elem = null;

    public synchronized void put (Integer newElem) throws InterruptedException {
        while (elem != null) {
            this.wait();
            if (elem != null) {
                notify();
            }
        }
        this.elem = newElem;
        this.notify();
    }

    public synchronized Integer get () throws InterruptedException {
        while (elem == null) {
            this.wait();
            if (elem == null) {
                this.notify();
            }
        }
        return elem;
    }
}
