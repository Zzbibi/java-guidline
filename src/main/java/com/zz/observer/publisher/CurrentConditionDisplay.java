package com.zz.observer.publisher;

import com.zz.observer.subscriber.Subject;

/**
 * @Author zhangzhen
 * @create 2022/11/11 21:33
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature:" + temperature + ", humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

}
