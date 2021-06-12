package others.socket.tests;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {
    public static void main(String[] args) throws IOException {
       URL url = new URL("http://baidu.com");
       URLConnection urlConnection = url.openConnection();
       InputStream i = urlConnection.getInputStream();
       InputStream buf = new BufferedInputStream(i);
       InputStreamReader ir = new InputStreamReader(buf);
       int len = -1;
       while ((len = ir.read())!=-1){
           System.out.print((char) len);
       }
       i.close();
       buf.close();
    }


}


