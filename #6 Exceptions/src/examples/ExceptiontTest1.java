package examples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by glebus on 03.08.17.
 */
public class ExceptiontTest1 {
    public static void main(String[] args) {
        try {
            saveToFile(new Object());
        } catch (IOException e) {
            System.out.println("Sorry....");
        }


//        boolean res = saveToFile(new Object());
//        if (res){
//           //
//        } else {
//            //
//        }
    }
    private static void saveToFile(Object o) throws IOException {
        FileOutputStream out = new FileOutputStream("d:/tmp/doc.txt");
        out.write(1);
    }

//    private static boolean saveToFile(Object o){
//        try {
//            new FileOutputStream("d:/tmp/doc.txt");
//            return true;
//        } catch (FileNotFoundException e) {
//            return false;
//        }
//    }
}
