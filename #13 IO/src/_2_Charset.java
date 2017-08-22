import java.io.*;

/**
 * Created on 15.08.17.
 */
public class _2_Charset {
    public static void main(String[] args) throws IOException {
        byte[] rawData = new byte[256];
        for (int k = 0; k < 256; k++) {
            rawData[k] = (byte) (k - 128);
        }

        InputStream is = new ByteArrayInputStream(rawData);
        Reader reader = new InputStreamReader(is, "UTF8");

        char[] buff = new char[16];
        int count;
        while ((count = reader.read(buff)) != -1) {
            System.out.println(new String(buff, 0, count));
        }
    }
}
