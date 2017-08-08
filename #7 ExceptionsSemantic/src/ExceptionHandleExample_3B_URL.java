import java.io.*;
import java.net.URL;

/**
 * Created on 04.08.17.
 */
public class ExceptionHandleExample_3B_URL {
    public static String download(String urlString) throws InternetException{
        InputStream in = null;
        try{
            in = new URL(urlString).openStream();
            Reader reader = new InputStreamReader(in);
            StringWriter writer = new StringWriter();
            char[] buff = new char[1024];
            int count;
            while((count = reader.read(buff)) != -1){
                writer.write(buff, 0, count);
            }
            return writer.toString();
        } catch(IOException e){
            throw new InternetException("Some error during downloading from url = '" + urlString + "'", e);
        } finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e){
                    //NOP
                }
            }
        }
    }

    public static void main(String[] args) throws InternetException {
//        System.out.println(download("http://google.com"));
        System.out.println(download("google.com"));
    }
}
