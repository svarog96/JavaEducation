package stackTrace;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created on 05.08.17.
 */
public class CauseExample_1 {

    public static void main(String[] args) {
        try{
            aaa();
        } catch(RuntimeException e){
            e.printStackTrace();
            //e.getCause();//аналог next
        }
    }

    private static void aaa() {
        bbb();
    }

    private static void bbb(){
        try{
            ccc();
        } catch (ApplicationStorageException e){
            throw new ApplicationLogicException("Some storage error",e);
        }
    }

    private static void ccc() throws ApplicationStorageException{
        try {
            new FileInputStream("1 2 3");
        } catch (FileNotFoundException e) {
            throw new ApplicationStorageException("Some file error", e);
        }
    }

}
