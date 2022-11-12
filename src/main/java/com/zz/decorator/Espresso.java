package com.zz.decorator;

/**
 * @Author zhangzhen
 * @create 2022/11/12 16:49
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
