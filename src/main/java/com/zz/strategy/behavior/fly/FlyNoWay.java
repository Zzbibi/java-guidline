package com.zz.strategy.behavior.fly;

/**
 * @Author zhangzhen
 * @create 2022/11/11 17:15
 */

/**
 * 假飞行行为，实际上不会飞
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly!");
    }

}
