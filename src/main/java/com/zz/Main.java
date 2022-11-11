package com.zz;

import com.zz.strategy.Duck;
import com.zz.strategy.MallardDuck;
import com.zz.strategy.ModelDuck;
import com.zz.strategy.behavior.fly.FlyRocketPowered;

/**
 * @Author zhangzhen
 * @create 2022/11/11 17:35
 */
public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuake();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
