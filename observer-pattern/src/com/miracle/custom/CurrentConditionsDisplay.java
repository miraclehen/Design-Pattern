package com.miracle.custom;

import com.miracle.DisplayElement;

/**
 * miracle
 * 2018/8/31 19:28
 * <p>
 * 现在的温度的布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("现在的天气是：温度为：" + temperature + ", 湿度为：" + humidity + "。");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
