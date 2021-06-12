package others.socket.tests;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress i = InetAddress.getByName("192.168.1.177");
        System.out.println(i);
        System.out.println(i.getHostAddress());
        System.out.println(i.getHostName());
        /*InetAddress i1 = InetAddress.getByName("127.0.0.1");
        System.out.println(i1.getCanonicalHostName());*/
    }
}
