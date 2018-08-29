package com.miracle.behavior.quack;

/**
 * miracle
 * 2018/8/29 19:56
 */
public class MuteQuack implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("不会叫!");
    }
}
