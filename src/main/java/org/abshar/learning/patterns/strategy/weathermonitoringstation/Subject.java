package org.abshar.learning.patterns.strategy.weathermonitoringstation;

/**
 * Created by HojatV on 1/27/2017.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
