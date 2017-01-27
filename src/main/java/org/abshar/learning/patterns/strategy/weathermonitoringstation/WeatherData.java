package org.abshar.learning.patterns.strategy.weathermonitoringstation;

import java.util.ArrayList;

/**
 * Created by HojatV on 1/27/2017.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float pressure;
    private float temperature;
    private float humidity;

    WeatherData(){
        observers = new ArrayList();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i > 0 ){
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for(Object o: observers){
            Observer observer = (Observer) o;
            ((Observer) o).update(temperature,humidity,pressure);
        }

    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
