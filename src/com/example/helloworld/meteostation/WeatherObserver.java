package com.example.helloworld.meteostation;

public interface WeatherObserver {
    void onWeatherChange(int temp, boolean precipitation);

}
