package com.zz.decorator;

/**
 * @Author zhangzhen
 * @create 2022/11/12 16:50
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
