package projects.chattingRoom;

import java.io.*;
import java.net.Socket;

public class ReceiveThread implements Runnable {
    private boolean isRunning = true;
    private Socket socket;
    private BufferedReader in;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            stopThreads();
        }
    }


    private void stopThreads() {
        isRunning = false;
        Utils.teminateIO(in, socket);
    }

    @Override
    public void run() {
        while (isRunning) {
            String msg = receiveMsg();
            System.out.println(msg);
        }
    }

    private String receiveMsg() {
        String msg = null;
        try {
            msg = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            stopThreads();
        }
        return msg;
    }
}
