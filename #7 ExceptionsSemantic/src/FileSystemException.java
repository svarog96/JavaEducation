/**
 * Created on 03.08.17.
 */
public class FileSystemException extends ApplicationException {

    public FileSystemException(String message){
        super(message);
    }

    public FileSystemException(String message, Throwable cause){
        super(message, cause);
    }
}
