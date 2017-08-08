package ru.exception;

/**
 * Created by glebus on 02.08.17.
 */
public class ExceptionTest_TCC_8 {
    public static void main(String[] args) {
        try{
            System.out.println(0);
            throw new NullPointerException();
        } catch (NullPointerException e){
            System.out.println(1);
            throw new ArithmeticException();
        } catch (ArithmeticException e){
            System.out.println(2);
        }
    }
}
