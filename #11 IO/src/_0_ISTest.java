import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created on 11.08.17.
 * некорректная программа, надо закрывать потоки!!!!
 */
public class _0_ISTest {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream("/home/glebus/my_projects/java/data/inStream.txt");
        readFullyByByte(inFile);
        System.out.println("\n");

        InputStream inUrl = new URL("http://google.com").openStream();
        readFullyByByte(inUrl);
        System.out.println("\n");

        InputStream inArray = new ByteArrayInputStream(new byte[] {65, 66, 67, 68, 69});
        readFullyByByte(inArray);
        System.out.println("\n");
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }
}
