package org.abshar.learning.patterns.strategy.weathermonitoringstation;

/**
 * Created by HojatV on 1/27/2017.
 */
public class ForecastDisplay implements DisplayElement, Observer{
    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        /*this.pressure = pressure;*/
        display();
    }

    public void display() {
        System.out.println("Forcasting : " + temperature + " F degress and " + humidity + " %humidity " );
    }}
