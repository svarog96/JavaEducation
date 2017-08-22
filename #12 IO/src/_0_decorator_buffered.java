import java.io.*;

/**
 * Created on 14.08.17.
 */
public class _0_decorator_buffered {
    public static void main(String[] args) throws IOException {
        String fileFromName = "/home/glebus/my_projects/java/data/cat.jpg";
        String fileToName = "/home/glebus/my_projects/java/data/outStream.jpg";

        for(int k = 1; k < 1024*1024; k *=2){
            InputStream in = null;
            OutputStream out = null;
            try{
                in = new BufferedInputStream(new FileInputStream(fileFromName), k);
                out = new BufferedOutputStream(new FileOutputStream(fileToName), k);
                long startTime = System.currentTimeMillis();
                copy0(in, out);
                long stopTime = System.currentTimeMillis();
                System.out.println(stopTime - startTime + " ms");
            } catch (IOException e) {
                throw new IOException("Exception when copy from '" + fileFromName + "' to file '" + fileToName + "'", e);
            } finally {
                closeQuietly(in);
                closeAndFlushQuietly(out);
            }
        }

    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buff = new byte[64 * 1024];
        int count;
        while((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
    }

    public static void copy(InputStream in, OutputStream out, int k) throws IOException {
        byte[] buff = new byte[k];
        int count;
        while((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
    }

    public static void copy0(InputStream in, OutputStream out) throws IOException {
        int oneByte;
        while((oneByte = in.read()) != -1){
            out.write(oneByte);
        }
    }


    private static void closeQuietly(InputStream in){
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore){
                //nop
            }
        }
    }

    private static void closeAndFlushQuietly(OutputStream out) {
        if (out != null) {
            try{
                out.flush();
            } catch (IOException ignore){/*NOP*/}
            try {
                out.close();
            } catch (IOException ignore){/*NOP*/}
        }
    }
}
