/**
 * Created on 04.08.17.
 */
public class ExceptionHandleExample_1 {

    public static int add (String str0, String str1){
        int i0;
        int i1;
        try{
            i0 = Integer.valueOf(str0);
        } catch(NumberFormatException e){
            throw new NumberFormatException("Try to add two nubers('" + str0 + "' + ' " + str1 + "') but the first argument not correct");
        }
        try{
            i1 = Integer.valueOf(str1);
        } catch(NumberFormatException e){
            throw new NumberFormatException("Try to add two nubers('" + str0 + "' + ' " + str1 + "') but the second argument not correct");
        }
        return i0 + i1;
    }

    public static void main(String[] args) {
        System.out.println(add("1", "123"));
//        System.out.println(add("1", "1a3"));
        System.out.println(add("2d", "5"));
    }
}
