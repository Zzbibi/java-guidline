package com.zz.abstractfactory.factory;

import com.zz.abstractfactory.product.ingredient.*;

/**
 * @Author zhangzhen
 * @create 2022/11/19 17:09
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return null;
    }

}
