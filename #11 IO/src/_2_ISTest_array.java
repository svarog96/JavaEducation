import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Created on 11.08.17.
 */
public class _2_ISTest_array {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/glebus/my_projects/java/data/inStream.txt";

        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readFullyByArray(inFile);
        } catch (IOException e) {
            throw new IOException ("Exception when open and read file " + fileName);
        } finally {
            closeQuietly(inFile);
        }
    }
    public static void readFullyByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while(true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("count = " + count
                + ", buff = " + Arrays.toString(buff)
                + ", str = " + new String(buff, 0, count, "UTF-8"));
            } else {
                break;
            }
        }
    }
    public static void closeQuietly(InputStream in){
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore){
                //nop
            }
        }
    }
}
