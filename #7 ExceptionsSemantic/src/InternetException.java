/**
 * Created on 03.08.17.
 */
public class InternetException extends ApplicationException {

    public InternetException(String message){
        super(message);
    }

    public InternetException(String message, Throwable cause){
        super(message, cause);
    }
}
