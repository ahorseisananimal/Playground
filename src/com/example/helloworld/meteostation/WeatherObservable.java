package com.example.helloworld.meteostation;

public interface WeatherObservable {
    void addObserver(WeatherObserver weatherObserver);

    void run();
}
