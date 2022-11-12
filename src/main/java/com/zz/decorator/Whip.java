package com.zz.decorator;

/**
 * @Author zhangzhen
 * @create 2022/11/12 16:55
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

}
