package com.zz.factorymethod.factory;

import com.zz.factorymethod.pizza.ChicagoStyleCheesePizza;
import com.zz.factorymethod.pizza.Pizza;

/**
 * @Author zhangzhen
 * @create 2022/11/19 16:37
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }

}
