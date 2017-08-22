import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created on 11.08.17.
 */
public class _1_ISTest_close_short {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/glebus/my_projects/java/data/inStream.txt";

        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readFullyByByte(inFile);
        } catch (IOException e) {
            throw new IOException("Exception when open and read file " + fileName);
        } finally {
            closeQuietly(inFile);
        }
    }
    private static void readFullyByByte(InputStream in) throws IOException {
        int oneByte;
        while ((oneByte = in.read()) != -1) {
            System.out.println((char) oneByte);
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
}
