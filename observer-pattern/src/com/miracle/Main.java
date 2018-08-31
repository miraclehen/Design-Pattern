package com.miracle;

import com.miracle.custom.CurrentConditionsDisplay;
import com.miracle.custom.WeatherData;
import com.miracle.inner.CurrentConditionsDisplayInner;
import com.miracle.inner.WeatherDataInner;

/**
 * miracle
 * 2018/8/31 19:31
 */
public class Main {


    public static void main(String[] args) {

        //自定义
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1F,2F,3F);
        weatherData.setMeasurements(10F,20F,30F);
        weatherData.setMeasurements(100F,200F,300F);



        //使用java内置的
        WeatherDataInner weatherDataInner = new WeatherDataInner();
        CurrentConditionsDisplayInner conditionsDisplayInner = new CurrentConditionsDisplayInner(weatherDataInner);
        weatherDataInner.setMeasurements(4F,5F,6F);
        weatherDataInner.setMeasurements(40F,50F,60F);
        weatherDataInner.setMeasurements(400F,500F,600F);

    }
}
