package com.zz.strategy;

import com.zz.strategy.behavior.fly.FlyNoWay;
import com.zz.strategy.behavior.quake.Quake;

/**
 * @Author zhangzhen
 * @create 2022/11/11 17:41
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quakeBehavior = new Quake();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }

}
