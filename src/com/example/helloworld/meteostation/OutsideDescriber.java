package com.example.helloworld.meteostation;

public class OutsideDescriber implements WeatherObserver {
    @Override
    public void onWeatherChange(int temp, boolean precipitation) {
        if (temp > 0) {
            System.out.print("It's warm and ");
            if (precipitation) {
                System.out.println("rainy");
            } else {
                System.out.println("dry");
            }
        } else {
            System.out.print("It's cold and ");
            if (precipitation) {
                System.out.println("snowy");
            } else {
                System.out.println("dry");
            }
        }
    }
}
