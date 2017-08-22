import java.io.File;
import java.io.IOException;

/**
 * Created on 22.08.17.
 */
public class FileTest_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/glebus/my_projects/java/data/data1.txt");
        System.out.println("exists: " + file.exists());
        System.out.println("  create new file: " + file.createNewFile());
        System.out.println("exists: " + file.exists());
        System.out.println("  delete: " + file.delete());
        System.out.println("exists: " + file.exists());
    }
}
