package com.example.helloworld;

public class ArraySorting {
    public static void main(String[] args) {
        int[] massive = new int[5];
        fillUpMassive(massive);
        checkingSorting(massive, true);
        sortMassiveV2(massive);
        checkingSorting(massive, true);

    }

    private static void sortMassive(int[] massive) {
        System.out.println("start sorting");
        while (!checkingSorting(massive, false)) {
            int freeCell = 0;
            for (int j = 0; j < massive.length - 1; j++) {
                if (massive[j] > massive[j + 1]) {
                    freeCell = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = freeCell;
                }

            }
        }
        System.out.println("end sorting");
    }

    private static void sortMassiveV2(int[] massive) {
        System.out.println("start sorting");
        boolean shouldCheck = true;
        while (shouldCheck) {
            shouldCheck = false;
            for (int j = 0; j < massive.length - 1; j++) {
                if (massive[j] > massive[j + 1]) {
                    int freeCell = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = freeCell;
                    shouldCheck = true;
                }

            }
        }
        System.out.println("end sorting");
    }

    private static void fillUpMassive(int[] massive) {
        int i = 0;
        while (i < massive.length) {
            massive[i] = (int) (Math.random() * 100);
            i = i + 1;
        }
    }

    private static void printMassive(int[] massive) {
        int i = 0;
        while (i < massive.length) {
            System.out.print(massive[i] + " ");
            i++;
        }
        System.out.println();
    }

    private static boolean checkingSorting(int[] massive, boolean printEnabled) {
        int i = 0;
        boolean isSorted = true;
        while (i < massive.length - 1) {
            if (massive[i] <= massive[i + 1]) {
                i++;
            } else {
                isSorted = false;
                break;
            }
        }
        if (printEnabled) {
            printMassive(massive);
            if (isSorted) {
                System.out.println("Massive is sorted");
            } else {
                System.out.println("Massive is unsorted");
            }
        }
        return isSorted;

    }
}
