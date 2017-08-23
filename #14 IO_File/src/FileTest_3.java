import java.io.File;
import java.io.IOException;

/**
 * Created on 22.08.17.
 */
public class FileTest_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/glebus/my_projects/java/data/testFile2/");
        initDir(file);
        fillDir(file, "a.txt", "b.txt", "c.txt");
        //naiveDeleteDir(file);
        delete(file);
    }

    private static void initDir(File file) throws IOException {
        if ( !file.exists()) {
            if (!file.mkdir()){
                throw new IOException("Can not create derctory " + file.getName());
            }
        }
    }

    private static void fillDir(File dir, String... fileNames) throws IOException {
        for (String fileName : fileNames) {
            if (!new File(dir, fileName).createNewFile()){
                throw new IOException("Can not create file " + fileName);
            }
        }
    }

    private static void naiveDeleteDir(File dir) throws IOException {
        if (!dir.delete())
            throw new IOException("Can not delete directory " + dir.getName());
    }

    private static void delete (File root) {
        if (root.isDirectory()){
            File[] files = root.listFiles();
            for (File file : files) {
                delete(file);
            }
        }
        root.delete();
    }
}
