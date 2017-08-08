/**
 * Created on 08.08.17.
 */
public class InterruptExample_3_interrupt_before_sleep {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e ) {
            System.out.println("Interrupted by exception");
        }
    }
}
