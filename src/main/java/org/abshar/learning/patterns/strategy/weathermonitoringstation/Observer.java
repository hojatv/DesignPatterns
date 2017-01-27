package org.abshar.learning.patterns.strategy.weathermonitoringstation;

/**
 * Created by HojatV on 1/27/2017.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
