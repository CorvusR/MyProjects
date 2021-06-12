package others.socket.tests;

import java.net.InetSocketAddress;

public class InetSocketAddressTest {
    public static void main(String[] args) {
        InetSocketAddress i = new InetSocketAddress("127.0.0.1",8080);
        System.out.println(i);
    }
}
