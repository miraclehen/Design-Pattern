package com.miracle.behavior.quack;

/**
 * miracle
 * 2018/8/29 19:55
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("鸭子呱呱地叫");
    }
}
