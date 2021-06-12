package others.socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 8888);
        InputStream inputStream = client.getInputStream();
        InputStream bf = new BufferedInputStream(inputStream);
        InputStreamReader ir = new InputStreamReader(bf);
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = ir.read()) != -1) {
            System.out.print((char) len);
        }


    }
}
