/**
 * Created on 17.08.17.
 */
public class DoubleAllocateStrategy implements AllocateStrategy {
    public int nextAfter(int now) {
        return now*2;
    }
}
