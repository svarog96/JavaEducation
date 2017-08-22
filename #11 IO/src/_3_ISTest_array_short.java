import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created on 11.08.17.
 */
public class _3_ISTest_array_short {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/glebus/my_projects/java/data/inStream.txt";

        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readFullyByArray(inFile);
        } catch (IOException e){
            throw new IOException("Exception when open and read file " + fileName);
        } finally {
            closeQuietly(inFile);
        }
    }
    public static void readFullyByArray (InputStream in) throws IOException {
        byte[] buff = new byte[5];
        int coutn;
        while ((coutn = in.read(buff)) != -1) {

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
