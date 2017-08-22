import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created on 17.08.17.
 */
public class TestBAOS {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(0);
        baos.write(new byte[]{1, 2, 3});
        baos.write(new byte[]{0, 0, 0, 4,5,6, 0, 0, 0}, 3, 3);

        byte[] rawData = baos.toByteArray();
        System.out.println(Arrays.toString(rawData));
    }
}
