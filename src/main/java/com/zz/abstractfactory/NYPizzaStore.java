package com.zz.abstractfactory;

import com.zz.abstractfactory.factory.NyPizzaIngredientFactory;
import com.zz.abstractfactory.factory.PizzaIngredientFactory;
import com.zz.abstractfactory.product.CheesePizza;
import com.zz.abstractfactory.product.Pizza;

/**
 * @Author zhangzhen
 * @create 2022/11/19 17:02
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();

        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY style cheese pizza");
        }

        return pizza;
    }

}
