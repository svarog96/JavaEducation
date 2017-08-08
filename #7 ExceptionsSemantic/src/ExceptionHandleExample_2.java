/**
 * Created on 04.08.17.
 */
public class ExceptionHandleExample_2 {
    public static int add (String str0, String str1){
        int i0;
        int i1;
        try{
            i0 = Integer.valueOf(str0);
        } catch (NumberFormatException e){
            System.out.println("Вай-вай-вай (#0)...");
            throw e;
        }
        try {
            i1 = Integer.valueOf(str1);
        } catch (NumberFormatException e){
            System.out.println("Вай-вай-вай (#1)...");
            throw e;
        }
        return i0 + i1;
    }

    public static void main(String[] args) {
        System.out.println(add("1", "123"));
//        System.out.println(add("1", "1a"));
        System.out.println(add("1 2 3", "2"));
    }
}
