package com.zz.strategy.behavior.fly;

/**
 * @Author zhangzhen
 * @create 2022/11/11 17:13
 */

/**
 * 真飞行行为
 */
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying!");
    }

}
