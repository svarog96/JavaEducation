/**
 * Created on 04.08.17.
 */
public class ExceptionHandleExample_0 {
    public static int add(String str0, String str1){
        int i0 = Integer.parseInt(str0);
        int i1 = Integer.parseInt(str1);
        return i0 + i1;
    }

    public static void main(String[] args) {
        System.out.println(add("1", "5"));
        System.out.println(add("1a", "1 2 3"));
    }
}
