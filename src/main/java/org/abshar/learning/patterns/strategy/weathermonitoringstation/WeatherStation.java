package org.abshar.learning.patterns.strategy.weathermonitoringstation;

/**
 * Created by HojatV on 1/27/2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);
        weatherData.setMeasurements(90,34,14.5f);
    }
}
