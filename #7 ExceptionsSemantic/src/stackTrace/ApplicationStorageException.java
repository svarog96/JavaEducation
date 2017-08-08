package stackTrace;

/**
 * Created on 05.08.17.
 */
public class ApplicationStorageException extends Exception {

    public ApplicationStorageException(String message){
        super(message);
    }

    public ApplicationStorageException(String message, Throwable cause){
        super(message, cause);
    }
}
