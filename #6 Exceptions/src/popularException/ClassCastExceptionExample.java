package popularException;

/**
 * Created by glebus on 03.08.17.
 */
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        int[] x = (int[]) new Object();
        int [] y = (int[])((Object)new float[]{});
    }
}

