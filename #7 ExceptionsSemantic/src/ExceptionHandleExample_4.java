import java.io.*;

/**
 * Created on 04.08.17.
 */
public class ExceptionHandleExample_4 {
    public static void log(String msg) {
        String fileName = "/home/glebus/my_projects/java/data/data_" + System.nanoTime() + ".txt";
        try {
            OutputStream outputStream = new FileOutputStream(fileName);
            Writer writer = new OutputStreamWriter(outputStream);
            writer.write(msg);
        } catch (IOException e) {
            new File(fileName).delete();
            System.out.println("Some error during log message = '" + msg + "'");
            e.printStackTrace();
        }
    }
}
