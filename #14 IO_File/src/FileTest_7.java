import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created on 28.08.17.
 */
public class FileTest_7 {
    private static final int COPY_BUFFER_SIZE = 60 * 1024;

    public static void main(String[] args) throws IOException {
        copyByStreamsOld(
                new File("/home/glebus/my_projects/java/data/img/cat.png"),
                new File("/home/glebus/my_projects/java/data/img/cat2.png"));
    }

    public static void copyByStreamsOld(File fileSrc, File fileDst) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(fileSrc);
            out = new FileOutputStream(fileDst);
            byte[] buff = new byte[COPY_BUFFER_SIZE];
            int count;

            while ((count = in.read(buff)) != -1) {
                out.write(buff, 0, count);
            }
            out.flush();
        } catch (IOException e) {
            throw new IOException("Exception when copy file " + fileSrc + " to file " + fileDst);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {//nop}
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {//nop}
                    }
                }
            }
        }
    }

    public static void copyByStreamNew(File fileSrc, File fileDst) throws IOException {
        try(FileInputStream in = new FileInputStream(fileSrc);
            FileOutputStream out = new FileOutputStream(fileDst, false)
        ){
            byte[] buff = new byte[COPY_BUFFER_SIZE];
            int count;
            while((count = in.read(buff)) != -1) {
                out.write(buff, 0, count);
            }
            out.flush();
        } catch (IOException e) {
            throw new IOException("Exception when copy file " + fileSrc + " to file " + fileDst);
        }
    }

    public static void copyByChanals(File fileSrc, File fileDst) throws IOException {
        try(FileInputStream in = new FileInputStream(fileSrc);
            FileOutputStream out = new FileOutputStream(fileDst, false)
        ){
            FileChannel inChannel = in.getChannel();
            FileChannel outChannel = out.getChannel();
            long count = 0;
            long size = inChannel.size();
            while (count < size) {
                long currentPosition = count;
                long bytesLeft = size - count;
                count += outChannel.transferFrom(inChannel, currentPosition, bytesLeft);
            }
        } catch (IOException e){
            throw new IOException("Exception when copy file " + fileSrc + " to file " + fileDst);
        }
    }
}