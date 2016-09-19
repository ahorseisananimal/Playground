package com.example.helloworld;

public class MyMath {
    public static long calcWithMath(int n) {
        return (long) divide(subtract(exponentiate(phi(), n), exponentiate(psi(), n)),
                subtract(phi(), psi()));
    }

    private static double exponentiate(double a, double b) {
        if (equal(b,zero())){
            return one();
        }else{
            return multiply(a, exponentiate(a,subtract(b,one())));
        }
    }

    private static double multiply(double a, double b) {
        return a*b;
    }

    private static boolean equal(double a, double b) {
        return a==b;
    }

    private static double zero() {
        return 0;
    }

    private static double psi() {
        return subtract(one(),phi());
    }

    private static double subtract(double a, double b) {
        return a-b;
    }

    private static double phi() {
                         return divide(add(one(), Math.sqrt(add(one(), one(),one(), one(),one()))),
                                 add(one(), one()));
    }

    private static double divide(double a, double b) {
        return a/b;
    }

    private static double add(double a, double b, double c, double d, double e) {
        return a+b+c+d+e;
    }

    private static double add(double a, double b) {
        return a+b;
    }

    private static double one() {
        return 1;
    }
}
