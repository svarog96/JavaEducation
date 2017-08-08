/**
 * Created on 03.08.17.
 */
public class ApplicationException extends Exception{

    public ApplicationException(String message){
        super(message);
    }

    public ApplicationException(String message, Throwable cause){
        super(message, cause);
    }
}
