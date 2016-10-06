package com.example.helloworld.meteostation;

import java.util.ArrayList;

public class WeatherStation implements WeatherObservable {
    ArrayList<WeatherObserver> weatherObservers = new ArrayList<>();

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void run() {
        try {
            notifyObservers(10, true);
            Thread.sleep(2000);
            notifyObservers(-10, false);
            Thread.sleep(2000);
            notifyObservers(15, false);
            Thread.sleep(2000);
            notifyObservers(-15, true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void notifyObservers(int temp, boolean precipitation) {
        System.out.println("The temperature is " + temp + " and precipitation is " + precipitation);
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.onWeatherChange(temp, precipitation);
        }
    }
}
