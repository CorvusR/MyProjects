package projects.chattingRoom;

import java.io.*;
import java.net.Socket;

public class SendThread implements Runnable {
    private boolean isRunning = true;
    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;
    private String SocketName;

    public SendThread(Socket socket, String name) {
        this.socket = socket;
        this.SocketName = name;
        try {
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e) {
            e.printStackTrace();
            stopThreads();
        }

    }

    @Override
    public void run() {
        while (isRunning) {
            String msg = readFromConsole();

            if (Utils.isEmpty(msg)) {
                System.out.println("消息为空！");
                continue;
            }
            sendMsg(msg);

        }
    }

    public void sendMsg(String message) {
        try {
            out.write(message);
            out.newLine();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
            stopThreads();
        }
    }

    private String readFromConsole() {
        String msg = null;
        System.out.print(this.SocketName + "说:");

        try {
            msg = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            stopThreads();
        }
        return msg;
    }

    private void stopThreads() {
        isRunning = false;
        Utils.teminateIO(in, out, socket);
    }
}
