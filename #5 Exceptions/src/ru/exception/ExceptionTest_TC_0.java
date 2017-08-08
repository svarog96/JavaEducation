package ru.exception;

/**
 * Created by glebus on 02.08.17.
 */
public class ExceptionTest_TC_0 {
    public static void main(String[] args) {
        byte b = 32;
        f(b);
        try{
            System.out.println(0);
            throw new RuntimeException();
        } catch(RuntimeException e){
            System.out.println(1);
        }
        System.out.println(2);
    }
    public static void f(int x){
        System.out.println(x);
    }
}
