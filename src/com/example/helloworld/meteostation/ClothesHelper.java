package com.example.helloworld.meteostation;

public class ClothesHelper implements WeatherObserver {
    @Override
    public void onWeatherChange(int temp, boolean precipitation) {
        if (temp > 0) {
            System.out.print("You don't need a coat ");
            if (precipitation) {
                System.out.println("but you need an umbrella");
            } else {
                System.out.println("and an umbrella");
            }
        } else {
            System.out.print("You need a coat ");
            if (precipitation) {
                System.out.println("and snowshoes");
            } else {
                System.out.println("but you don't need snowshoes");
            }
        }
    }
}
