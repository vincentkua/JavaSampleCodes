package ref;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StreamServer {

    public static void main(String[] args) throws IOException {

        int port = 3000;
        System.out.println("Starting Server on port " + port);
        ServerSocket server = new ServerSocket(port);

        while (true) {
            Socket sock = server.accept();
            System.out.println("New client connected");

            // Output and InputStream
            OutputStream os = sock.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            InputStream is = sock.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            boolean stop = false;

            // Main Server App Start here
            try {
                dos.writeUTF("Connected!!!");

                while (!stop) {
                    String clientcommand = dis.readUTF();
                    if (clientcommand.equals("exit")) {
                        stop = true;
                        break; // this is not required as stop = true will end this loop.
                    } else {
                        System.out.println("Received from Client - " + clientcommand);
                    }
                }

                // Client Session ended and closing Connection
                System.out.println("Terminating client connection");
                try {
                    sock.close();
                    System.out.println("Terminated");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Client Disconnected");
                break;
            }

        }

        
        // session ended and closing connection
        System.out.println("Closing connection");
        try {
            server.close();
            System.out.println("Terminated");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
