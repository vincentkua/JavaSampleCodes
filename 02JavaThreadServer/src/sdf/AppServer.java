package sdf;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AppServer {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ServerSocket server = new ServerSocket(Integer.parseInt(args[0]));
        System.out.println("Waiting For Connection...");
        while (true) {
            Socket socket = server.accept();
            System.out.printf("Connection received on port %s.\n", args[0]);
            ClientHandler CH = new ClientHandler(socket);
            executorService.submit(CH);

        }

    }
}
