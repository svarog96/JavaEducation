package questionClass;

/**
 * Created on 11.08.17.
 */
public class InterruptedProducer implements Runnable {
    private int startValue;
    private final InterruptBuffer buffer;

    public InterruptedProducer(int startValue, InterruptBuffer buffer) {
        this.buffer = buffer;
        this.startValue = startValue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(startValue + " produced");
                buffer.put (startValue++);
                Thread.sleep((int) (1000 * Math.random()));
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
