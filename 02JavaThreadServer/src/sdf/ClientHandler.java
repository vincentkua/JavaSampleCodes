package sdf;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
  private Socket socket;

  public ClientHandler() {
  }

  public ClientHandler(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {

    try (InputStream is = socket.getInputStream()) {
      DataInputStream dis = new DataInputStream(is);
      OutputStream os = socket.getOutputStream();
      DataOutputStream dos = new DataOutputStream(os);
      String userinput = "";

      dos.writeUTF("Connected!!!!");
      dos.flush();

      while (!userinput.equalsIgnoreCase("close")) {
        userinput = dis.readUTF();
        System.out.println("User requested >>> " + userinput);
        if (userinput.equalsIgnoreCase("close")) {
          dos.writeUTF("Ok byebye");
          dos.flush();
        }else{
          dos.writeUTF("returning some cookie");
          dos.flush();
        }

      }
      dos.close();
      os.close();
      dis.close();
      is.close();

      System.out.println("Client Disconnected...");

    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
}
