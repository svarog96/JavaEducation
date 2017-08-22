import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * Created on 22.08.17.
 */
public class FileTest_0 {
    public static void main(String[] args) {
        File file = new File("/home/glebus/my_projects/java/data/");
        System.out.println(file);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(Arrays.toString(file.listFiles(new FileFilter(){//фильтр
            @Override
            public boolean accept(File file) {
                return file.isFile();
            }
        })));
    }

}
