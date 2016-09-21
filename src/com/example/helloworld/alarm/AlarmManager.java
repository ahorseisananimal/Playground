package com.example.helloworld.alarm;

import java.util.Scanner;

public class AlarmManager {
    public static void main(String[] args) {
        System.out.println(getThreadName() + " Input time in format \"t number\"");
        while (true) {
            Scanner in = new Scanner(System.in);
            String n = in.nextLine();
            String[] split = n.split(" ");
            if (split.length != 2 || !split[0].equals("t") || !isNumeric(split[1])) {
                System.out.println("Wrong input type");
                continue;
            }
            int delay = Integer.parseInt(split[1]) * 1000;
            new Thread(new AlarmRunnable(delay)).start();
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName() + ">";
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private static class AlarmRunnable implements Runnable {
        private int delay;

        public AlarmRunnable(int delay) {
            this.delay = delay;
        }

        @Override
        public void run() {
            System.out.println(getThreadName() + " Created with " + delay + "ms delay");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getThreadName() + " It's time!");
        }
    }
}
