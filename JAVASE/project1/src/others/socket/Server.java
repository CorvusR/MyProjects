package others.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
       ServerSocket socket = new ServerSocket(8888);
        System.out.println("服务器启动成功");
        Socket client = socket.accept();
        System.out.println(client.getInetAddress().getHostAddress()+"连接成功");
        OutputStream outputStream =client.getOutputStream();
        outputStream.write("你好啊".getBytes(StandardCharsets.UTF_8));

    }
}
