package com.zz.abstractfactory;

import com.zz.abstractfactory.factory.ChicagoPizzaIngredientFactory;
import com.zz.abstractfactory.factory.PizzaIngredientFactory;
import com.zz.abstractfactory.product.CheesePizza;
import com.zz.abstractfactory.product.Pizza;

/**
 * @Author zhangzhen
 * @create 2022/11/19 17:07
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style cheese pizza");
        }

        return pizza;
    }

}
