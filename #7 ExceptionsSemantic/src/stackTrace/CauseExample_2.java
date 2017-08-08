package stackTrace;

/**
 * Created on 05.08.17.
 */
public class CauseExample_2 {
    public static void main(String[] args) {
        System.out.println(new RuntimeException().getCause());
        System.out.println(new Error(new Exception(new RuntimeException())).getCause());
    }
}
