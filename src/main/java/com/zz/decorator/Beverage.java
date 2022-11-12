package com.zz.decorator;

/**
 * @Author zhangzhen
 * @create 2022/11/12 16:45
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
