import java.nio.charset.Charset;
import java.util.SortedMap;

/**
 * Created on 15.08.17.
 */
public class _0_Charset {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsetMap = Charset.availableCharsets();
        for(String name : charsetMap.keySet()) {
            System.out.println(name);
        }
    }
}
