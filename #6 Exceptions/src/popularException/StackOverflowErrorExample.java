package popularException;

/**
 * Created by glebus on 03.08.17.
 */
public class StackOverflowErrorExample {
    public static void main(String[] args) {
        f();
    }
    private static void f(){
        f();
    }
}
