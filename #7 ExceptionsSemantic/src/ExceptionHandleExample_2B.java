import java.io.*;

/**
 * Created on 04.08.17.
 */
public class ExceptionHandleExample_2B {
    public static void log(String msg) throws IOException {
        String fileName = "/home/glebus/my_projects/java/data/data_" + System.nanoTime() + ".txt";
        OutputStream outputStream = new FileOutputStream(fileName);
        try{
            Writer writer = new OutputStreamWriter(outputStream);
            writer.write(msg);
        } catch (IOException e){
            new File(fileName).delete();
            throw e;
        }
        finally {
            outputStream.close();
        }
    }
}
