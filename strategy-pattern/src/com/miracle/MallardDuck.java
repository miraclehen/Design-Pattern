package com.miracle;

import com.miracle.behavior.fly.FlyWithWings;
import com.miracle.behavior.quack.Quack;

/**
 * miracle
 * 2018/8/29 19:41
 *
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //绿头鸭只会呱呱叫
        quackBehavior = new Quack();
        //绿头鸭可以随风飞翔
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("外观是绿头");
    }
}
