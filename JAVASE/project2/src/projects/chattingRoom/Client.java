package projects.chattingRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("127.0.0.1", 8888);
            System.out.println("服务器已连接");
            System.out.println("请输入你的名字:");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String name = in.readLine();
            if (Utils.isEmpty(name)) {
                System.out.println("请输入正确格式的名称");
                return;
            }
            Thread send = new Thread(new SendThread(client, name));
            Thread receive = new Thread(new ReceiveThread(client));
            send.start();
            receive.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
