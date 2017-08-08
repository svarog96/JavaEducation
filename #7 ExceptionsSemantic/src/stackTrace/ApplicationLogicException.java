package stackTrace;

/**
 * Created on 05.08.17.
 */
public class ApplicationLogicException extends RuntimeException {

    public ApplicationLogicException(String message){
        super(message);
    }

    public ApplicationLogicException(String message, Throwable cause){
        super(message,cause);
    }
}
