package ref;

import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class StreamClient {

    public static void main(String[] args) throws IOException{

        Console cons = System.console();
        String host = "127.0.0.1";
        int port = 3000;
        boolean stop = false;
        System.out.println("Connecting to " + host + ":" + port);
        Socket sock = new Socket(host, port); 

        //Output and InputStream
        OutputStream os = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = sock.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        //Get the 1st server status when connected
        String connectstatus = dis.readUTF();
        System.out.println(connectstatus);

        //Main Client App Start here
        while(!stop){

            String input = cons.readLine(">");
            if (input.equals("exit")){
                dos.writeUTF("exit");
                dos.flush();
                stop = true;              
            } else{
                dos.writeUTF(input);
            }

        }

        //session ended and closing connection
        System.out.println("Closing connection");
        try {
            sock.close();
            System.out.println("Terminated");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



        

    }
    
}
