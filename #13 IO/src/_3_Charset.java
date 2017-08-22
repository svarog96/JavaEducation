import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 * Created on 15.08.17.
 */
public class _3_Charset {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        try {
            is = new URL("http://e1.ru").openStream();
            Reader reader = new InputStreamReader(is, "UTF8");

            char[] buff = new char[160];
            int count;
            while ((count = reader.read(buff)) != -1) {
                System.out.println(new String(buff, 0, count));
            }
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ignore) {//NOP}
                }
            }
        }
    }
}
