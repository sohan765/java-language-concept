import java.net.*;
import java.util.*;
import java.io.*;

public class HelloClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("10.248.248.121", 8080);
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();

         OutputStream out = socket.getOutputStream();
        //out.write(m.getBytes());
        out.write(m.getBytes());


        socket.close();
    }
}
// import java.net.*;
// import java.util.*;
// import java.io.*;

// class ClientHandler implements Runnable {
//     private String host;
//     private int port;
//     private String message;

//     public ClientHandler(String host, int port, String message) {
//         this.host = host;
//         this.port = port;
//         this.message = message;
//     }

//     @Override
//     public void run() {
//         try {
//             Socket socket = new Socket(host, port);

//             OutputStream out = socket.getOutputStream();
//             out.write(message.getBytes());

//             System.out.println("Sent to " + host + ":" + port);

//             socket.close();
//         } catch (Exception e) {
//             System.out.println("Error connecting to " + host + ":" + port);
//         }
//     }
// }

// public class HelloClient {
//     public static void main(String[] args) throws Exception {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter message: ");
//         String m = sc.nextLine();

//         // List of multiple servers
//         List<String> servers = Arrays.asList(
//                 "127.0.0.1:8080",
//                 "127.0.0.1:8081",
//                 "127.0.0.1:8082"
//         );

//         // Create thread for each server
//         for (String server : servers) {
//             String[] parts = server.split(":");
//             String host = parts[0];
//             int port = Integer.parseInt(parts[1]);

//             Thread t = new Thread(new ClientHandler(host, port, m));
//             t.start();
//         }
//     }
// }
