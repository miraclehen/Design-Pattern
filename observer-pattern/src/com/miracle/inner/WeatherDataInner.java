package com.miracle.inner;

import java.util.Observable;

/**
 * miracle
 * 2018/8/31 19:40
 *
 * 天气数据
 */
public class WeatherDataInner extends Observable {

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


    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
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
