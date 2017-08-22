import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created on 11.08.17.
 */
public class _4_OSTest {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/glebus/my_projects/java/data/outStream.txt";

        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            byte[] data = readFullyByByte(inFile);
            System.out.println(new String(data, "UTF8"));
        } catch (IOException e) {
            throw new IOException("Exception when open and read file " + fileName);
        } finally {
            closeQuietly(inFile);
        }
    }
    private static void closeQuietly(InputStream in){
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore){
                //nop
            }
        }
    }
    private static byte[] readFullyByByte(InputStream in) throws IOException {
        int oneByte;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while ((oneByte = in.read()) != -1) {
            out.write(oneByte);
        }
        return out.toByteArray();
    }
}
