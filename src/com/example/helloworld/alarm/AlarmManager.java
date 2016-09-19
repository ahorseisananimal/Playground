package com.example.helloworld.alarm;

import java.util.Scanner;

public class AlarmManager {
    public static void main(String[] args) {
        while (true) {
            System.out.println(Thread.currentThread().getName()+" Input time in format \"t number\"");
            Scanner in = new Scanner(System.in);
            String n = in.nextLine();
            String[] split = n.split(" ");
            if (split.length != 2 || !split[0].equals("t") || !isNumeric(split[1])) {
                System.out.println("Wrong input type");
                continue;
            }
            int delay = Integer.parseInt(split[1]);
            new Thread(new AlarmRunnable()).start();
        }
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private static class AlarmRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" Lol");
        }
    }
}
