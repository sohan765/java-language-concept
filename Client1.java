import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1", 5000);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello from Client 1");

        socket.close();
    }
}