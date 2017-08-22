package questionClass;

/**
 * Created on 11.08.17.
 */
public class ThreadNode {
    public final Thread value;
    public final ThreadNode next;

    public ThreadNode(Thread value, ThreadNode next) {
        this.value = value;
        this.next = next;
    }
}
