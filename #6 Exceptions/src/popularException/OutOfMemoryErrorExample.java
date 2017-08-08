package popularException;

/**
 * Created by glebus on 03.08.17.
 *
 * started with param -XMX256M -Xms256M
 */

public class OutOfMemoryErrorExample {
    public static final int SIZE = 1024*1024;

    public static void main(String[] args) {
        Object[] tail = null;

        while(true) {
            tail = new Object[]{tail, new Object[SIZE]};
        }
    }
}
