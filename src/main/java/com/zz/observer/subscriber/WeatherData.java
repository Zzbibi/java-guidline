package com.zz.observer.subscriber;

import com.zz.observer.publisher.Observer;

import java.util.ArrayList;

/**
 * @Author zhangzhen
 * @create 2022/11/11 21:23
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData () {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index > -1) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
