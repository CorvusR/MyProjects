package projects.chattingRoom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Server {
    private boolean isRunning = true;
    private List<SocketChannels> clients;

    public static void main(String[] args) {
        new Server().startServer();
    }

    private void startServer() {
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("**********服务端已开启**********");
            clients = new ArrayList<>();
            while (isRunning) {
                Socket client = server.accept();
                SocketChannels channels = new SocketChannels(client);
                clients.add(channels);
                new Thread(channels).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class SocketChannels implements Runnable {
        private boolean isRunning;
        private Socket socket;
        private String socketName;
        private BufferedReader in;
        private BufferedWriter out;

        public SocketChannels(Socket socket) {
            this.socket = socket;
            try {
                this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String name = receiveMsg();
                System.out.println(name + "上线啦!!!!!!!!!!!!!!!!!!!!");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private String receiveMsg() {
            try {
                String message = in.readLine();
                if (Utils.isEmpty(message)) {
                    return "消息不能为空!";
                } else {
                    return message;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        private void sendMsg(String msg, BufferedWriter out) {
            if (Utils.isEmpty(msg)) {
                System.out.println("服务器信息为空");
                return;
            }
            try {
                out.write(msg);
                out.newLine();
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
                stopThreads();
            }

        }

        private void sendMsgToOthers(String msg, boolean isSysMsg) {
            Map<String, String> map = Utils.isSingleChat(msg);
            if (map == null) {
                for (SocketChannels someone : clients) {
                    if (someone == this) {
                        continue;
                    }

                    if (isSysMsg) {
                        sendMsg("系统消息:" + msg, someone.out);
                    } else {
                        sendMsg(this.socketName + "对所有人说:" + msg, someone.out);
                    }
                }
            } else {
                socketName = getName(map);
                String getMsg = map.get(socketName);
                for (SocketChannels others : clients) {
                    if (others.socketName.equals(socketName)) {
                        sendMsg(this.socketName + ",对你悄悄说:" + getMsg, others.out);
                    }
                }
            }
        }

        private String getName(Map<String, String> map) {
            if (map == null || map.size() == 0) {
                return null;
            }
            Set<String> keys = map.keySet();
            return new ArrayList<>(keys).get(0);
        }

        private void stopThreads() {
            isRunning = false;
            Utils.teminateIO(in, out, socket);
        }

        @Override
        public void run() {
            while (isRunning) {
                String msg = receiveMsg();
                msg = Utils.filter(msg);
                sendMsgToOthers(msg, false);
            }
        }
    }
}
