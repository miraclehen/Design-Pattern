package com.miracle;

import com.miracle.behavior.fly.FlyRocketPowered;

/**
 * miracle
 * 2018/8/29 20:02
 */
public class Main {


    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        //动态改变行为
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
