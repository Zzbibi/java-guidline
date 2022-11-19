package com.zz.strategy;

import com.zz.strategy.behavior.fly.FlyBehavior;
import com.zz.strategy.behavior.quake.QuakeBehavior;

/**
 * @Author zhangzhen
 * @create 2022/11/11 16:53
 */
public abstract class Duck {

    // 鸭子的行为统统委托给行为类
    FlyBehavior flyBehavior;
    QuakeBehavior quakeBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuake() {
        quakeBehavior.quake();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuakeBehavior(QuakeBehavior quakeBehavior) {
        this.quakeBehavior = quakeBehavior;
    }

}
