package com.example.helloworld.simpleConsoleChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyLittleServer {

    public static void main(String[] args) throws IOException {
        new MyLittleServer().start();
    }

    private void start() throws IOException {
        ServerSocket serverSock = new ServerSocket(4242);
        Socket sock;

        ArrayList<Socket> sockets = new ArrayList<>();
        while (true) {
            sock = serverSock.accept();
            System.out.println("Client connected");
            sockets.add(sock);
            new Thread(new MySocketHandler(sock)).start();

        }
    }
}
