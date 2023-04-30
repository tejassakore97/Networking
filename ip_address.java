import java.net.*;

public class ip_address {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String host = addr.getHostName();
            System.out.println("IP Address is: " + addr);
            System.out.println("Host Name is:" + host);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
