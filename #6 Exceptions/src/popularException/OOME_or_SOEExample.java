package popularException;

/**
 * Created by glebus on 03.08.17.
 *
 * Started with param -XMX256M -Xms256M -->
 */
public class OOME_or_SOEExample {
    public static final int SIZE = 1024 * 1024; //win OOME
//    public static final int SIZE = 1024; //win SOE

    public static void main(String[] args) {
        f(new Object[]{new Object[SIZE]});
    }
    public static void f (Object[] tail) {
        f(new Object[]{tail, new Object[SIZE]});
    }
}
