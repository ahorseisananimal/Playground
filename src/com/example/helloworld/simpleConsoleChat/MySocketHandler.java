package com.example.helloworld.simpleConsoleChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MySocketHandler implements Runnable {
    private Socket sock;

    public MySocketHandler(Socket sock) {

        this.sock = sock;
    }

    @Override
    public void run() {
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String input;
            while ((input = in.readLine()) != null) {
                if (input.equalsIgnoreCase("exit")) break;



                System.out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            sock.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
