package com.miracle;

import com.miracle.behavior.fly.FlyBehavior;
import com.miracle.behavior.quack.QuackBehavior;

/**
 * miracle
 * 2018/8/29 19:40
 *
 * 鸭子的超类
 */
public abstract class Duck {

    /**
     * 飞翔
     */
    FlyBehavior flyBehavior;

    /**
     * 叫声
     */
    QuackBehavior quackBehavior;

    /**
     * 发出叫声
     */
    void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 开始飞翔
     */
    void performFly(){
        flyBehavior.fly();
    }

    /**
     * 游泳
     */
    void swim(){
        System.out.println("开始游泳!!");
    }

    /**
     * 外表展示
     */
    void display(){
        System.out.println("展示外表");
    }


    /**
     * 设置飞行行为
     * @param behavior b
     */
    public void setFlyBehavior(FlyBehavior behavior) {
        flyBehavior = behavior;
    }

    /**
     * 设置叫的行为
     * @param behavior b
     */
    public void setQuackBehavior(QuackBehavior behavior) {
        quackBehavior = behavior;
    }



}
