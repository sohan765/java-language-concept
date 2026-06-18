import java.io.*;
import java.net.*;

public class Client3 {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("10.248.248.99", 5000);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello from Client 3");

        socket.close();
    }
}