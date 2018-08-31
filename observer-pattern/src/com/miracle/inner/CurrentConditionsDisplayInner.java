package com.miracle.inner;

import com.miracle.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * miracle
 * 2018/8/31 19:43
 *
 * 布告板
 */
public class CurrentConditionsDisplayInner implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionsDisplayInner(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("现在的天气是：温度为：" + temperature + ", 湿度为：" + humidity + "。");
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        //可能有多个气象站，需要判断是哪个气象站通知的数据
        if (o instanceof WeatherDataInner) {
            WeatherDataInner data = (WeatherDataInner) o;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();

            display();
        }
    }
}
