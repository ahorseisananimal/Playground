package com.example.helloworld;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by home on 10-Jun-16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int beerNum = 99;

        while (beerNum > 0) {
            if (beerNum > 4) {
                System.out.print(beerNum + " бутылок стояло на столе.");
            } else {
                if (beerNum > 1) {
                    System.out.print(beerNum + " бутылки стояло на столе.");
                }
                if (beerNum == 1) {
                    System.out.print(beerNum + " бутылка стояла на столе.");
                }
            }
            beerNum = beerNum - 1;
            if (beerNum > 4) {
                System.out.println(" Одна из них упала, " + beerNum + " бутылок осталось на столе.");
            } else {
                if (beerNum > 1) {
                    System.out.println(" Одна из них упала, " + beerNum + " бутылки осталось на столе.");
                }
                if (beerNum == 1) {
                    System.out.println(" Одна из них упала, " + beerNum + " бутылка осталась на столе.");
                }
                if (beerNum == 0) {
                    System.out.println(" И она упала, " + beerNum + " бутылок осталось на столе.");
                }
            }
        }

    }
}



