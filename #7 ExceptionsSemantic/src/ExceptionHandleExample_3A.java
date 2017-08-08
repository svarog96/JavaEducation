import java.io.*;

/**
 * Created on 04.08.17.
 *
 * BL---->log----->FS
 */
public class ExceptionHandleExample_3A {
    public static void log(String msg) throws FileSystemException{
        String fileName = "/home/glebus/my_projects/java/data/data_" + System.nanoTime() + ".txt";

        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            Writer writer = new OutputStreamWriter(outputStream);
            writer.write(msg);
        } catch (IOException e){
            new File(fileName).delete();
            throw new FileSystemException("Some error during log message");
        }
    }
}
