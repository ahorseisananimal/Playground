package com.example.helloworld.dailyAdvice;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {
    String[] adviceList = {"Eat less", "Do more", "Walk oftner", "Read good books", "Love your soulmate"};

    public void go(){
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Today you should " + advice);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
