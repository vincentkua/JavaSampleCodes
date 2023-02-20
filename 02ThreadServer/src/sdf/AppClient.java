package sdf;

import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public final class AppClient {

    public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException {
        Socket socket = new Socket("localhost", Integer.parseInt(args[0]));
        try (OutputStream os = socket.getOutputStream()) {
            DataOutputStream dos = new DataOutputStream(os);
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            Console cons = System.console();
            String readInput = "";
            String response = "";

            String serverconnected = dis.readUTF();
            System.out.println(serverconnected);

            while (!readInput.equalsIgnoreCase("close")) {
                readInput = cons.readLine("Enter a command: ");
                dos.writeUTF(readInput);
                dos.flush();
                response = dis.readUTF();
                System.out.println(response);
            }
            dos.close();
            os.close();
            dis.close();
            is.close();

            // session ended and closing connection
            System.out.println("Closing connection");
            try {
                socket.close();
                System.out.println("Terminated");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
