import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
   public HelloServer() {
   }

   public static void main(String[] var0) throws Exception {
      ServerSocket var1 = new ServerSocket(8080);
      Socket var2 = var1.accept();
      InputStream var3 = var2.getInputStream();

      int var4;
      while((var4 = var3.read()) != -1) {
         System.out.print((char)var4);
      }

      var2.close();
      var1.close();
   }
}
// import java.io.InputStream;
// import java.net.ServerSocket;
// import java.net.Socket;

// class ClientHandler implements Runnable {
//     private Socket socket;

//     public ClientHandler(Socket socket) {
//         this.socket = socket;
//     }

//     @Override
//     public void run() {
//         try {
//             InputStream in = socket.getInputStream();
//             int data;

//             System.out.println("Client connected: " + socket.getPort());

//             while ((data = in.read()) != -1) {
//                 System.out.print((char) data);
//             }

//             System.out.println("\nClient disconnected: " + socket.getPort());
//             socket.close();

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class HelloServer {
//     public static void main(String[] args) throws Exception {

//         ServerSocket server = new ServerSocket(8080);
//         System.out.println("Server started on port 8080...");

//         while (true) {
//             Socket client = server.accept(); // accept multiple clients

//             // Handle each client in separate thread
//             Thread t = new Thread(new ClientHandler(client));
//             t.start();
//         }
//     }
// }