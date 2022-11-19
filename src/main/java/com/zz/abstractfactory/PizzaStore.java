package com.zz.abstractfactory;


import com.zz.abstractfactory.product.Pizza;

/**
 * @Author zhangzhen
 * @create 2022/11/19 16:19
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 工厂方法
    abstract Pizza createPizza(String type);

}
