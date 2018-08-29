package com.miracle;

import com.miracle.behavior.fly.FlyNoWay;
import com.miracle.behavior.quack.Quack;

/**
 * miracle
 * 2018/8/29 20:06
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("我是模型鸭!");
    }
}
