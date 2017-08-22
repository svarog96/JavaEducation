import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * Created on 14.08.17.
 */
public class _1_decorator_gzip {
    public static void main(String[] args) throws IOException {
        String fileFromName = "/home/glebus/my_projects/java/data/bigData.txt";
        String fileToName = "/home/glebus/my_projects/java/data/data0.xxx";

        InputStream in = new SniffInputStream(
                        new BufferedInputStream(
                         new SniffInputStream(
                         new FileInputStream(fileFromName))));
        OutputStream out = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(fileToName)));

        int count;
        byte[] buff = new byte[256];
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
    }
}
