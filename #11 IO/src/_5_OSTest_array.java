import java.io.*;

/**
 * Created on 13.08.17.
 */
public class _5_OSTest_array {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/glebus/my_projects/java/data/inStream.txt";

        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            byte[] data = readFullyByByte(inFile);
            System.out.println(new String(data, "UTF8"));
        } catch (IOException e) {
            throw new IOException("Exception when open and read file" + fileName);
        } finally {
            closeQuietly(inFile);
        }
    }

    public static byte[] readFullyByByte(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte [] buff = new byte[5];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
        return out.toByteArray();
    }

    public static void closeQuietly(InputStream in){
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore){
                //nop
            }
        }
    }
}
