package com.miracle.custom;

/**
 * miracle
 * 2018/8/31 19:18
 *
 * 观察者
 */
public interface Observer {

    /**
     * 更新气象数据
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);

}
