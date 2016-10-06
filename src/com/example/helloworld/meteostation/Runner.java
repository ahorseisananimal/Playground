package com.example.helloworld.meteostation;

public class Runner {
    public static void main(String[] args) {
        WeatherObservable weatherStation = new WeatherStation();
        weatherStation.addObserver(new ClothesHelper());
        weatherStation.addObserver(new OutsideDescriber());
        weatherStation.run();
    }

}
