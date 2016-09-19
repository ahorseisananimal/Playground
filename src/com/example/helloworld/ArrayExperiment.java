package com.example.helloworld;

public class ArrayExperiment {

    public static final int EXPEREMENTS_COUNT = 1000;
    public static final int MAX_ELEMENTS = 100;

    public static void main(String[] args) {
        int[] massive = new int[5];
        int i = 0;
        int globalCount = 0;
        int unsortedArrayCount = 0;
        while (globalCount < EXPEREMENTS_COUNT) {
            while (i < 5) {
                massive[i] = (int) (Math.random() * MAX_ELEMENTS);
               // System.out.println(massive[i]);
                i = i + 1;
            }
            i = 0;
            while (i < 4) {
                if (massive[i] < massive[i + 1]) {
                    i++;
                } else {
                    unsortedArrayCount++;
                    i = 0;
                    break;
                }
            }
            globalCount++;
        }
        System.out.println("result: " + (100-unsortedArrayCount/1000000.0d) + "% sorted");
        System.out.println("result: " + ((EXPEREMENTS_COUNT-unsortedArrayCount)/(EXPEREMENTS_COUNT/100.d)) + "% sorted");
    }
}
