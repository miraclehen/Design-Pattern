package com.miracle.custom;

import java.util.ArrayList;

/**
 * miracle
 * 2018/8/31 19:15
 *
 * 天气数据
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    /**
     * 气温
     */
    private float temperature = 0.0F;

    /**
     * 湿度
     */
    private float humidity = 0.0F;

    /**
     * 气压
     */
    private float pressure = 0.0F;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 注册观察者
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当气象站有数据回来，会调用此方法
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 模拟气象数据发生变化
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}














