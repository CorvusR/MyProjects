package demos.Socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8888);
            serverSocket.accept();
            InputStream in = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = in.read(bytes))!=0){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
