package com.zz.factorymethod.factory;

import com.zz.factorymethod.pizza.NYStyleCheesePizza;
import com.zz.factorymethod.pizza.Pizza;

/**
 * @Author zhangzhen
 * @create 2022/11/19 16:23
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        }
        return null;
    }

}
