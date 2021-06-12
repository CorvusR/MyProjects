package demos.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",8888);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
