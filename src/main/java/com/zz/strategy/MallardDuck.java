package com.zz.strategy;

import com.zz.strategy.behavior.fly.FlyWithWings;
import com.zz.strategy.behavior.quake.Quake;

/**
 * @Author zhangzhen
 * @create 2022/11/11 17:39
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quakeBehavior = new Quake();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }

}
