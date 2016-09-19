package com.example.helloworld;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Type a number of a Fibonachi's number");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            System.out.println("You typed " + n);
            long currentTime = System.currentTimeMillis();
            System.out.println(calcWiki(n));
           //calcWithCycle(n);
           //System.out.println(calcWithRecursion(n));
           // System.out.println(MyMath.calcWithMath(n));
            System.out.println("time spend is " + (System.currentTimeMillis() - currentTime));
        }
    }

    private static long calcWithRecursion(int n) {
        System.out.println("calcWithRecursion called for " + n);
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return  1;
        }
        return calcWithRecursion(n-1)+calcWithRecursion(n-2);
    }


    private static long calcWiki(int n) {
        long x = 1; //n - 2
        long y = 0;  //n - 1
        long ans = 0; //n
        for (int i = 1; i<=n; i++){
            ans  = x + y;
            x = y;
            y = ans;
        }
        return ans;
    }

    private static void calcWithCycle(int n) {
        long previous = 0;
        long current = 1;
        long sideNumber = 0;
        for (int i = 1; i <= n; i++) {
            sideNumber = current;
            current = current + previous;
            if (i > 1) {
                previous = sideNumber;
            }
         //   System.out.println("i: " + i + " previous: " + previous + " current: " + current);
        }
        System.out.println("The number is " + current);
        System.out.println();
    }
}
