package com.miracle.behavior.quack;

/**
 * miracle
 * 2018/8/29 19:55
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("橡皮鸭子呮呮地叫!");
    }
}
