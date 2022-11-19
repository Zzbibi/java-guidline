package com.zz.abstractfactory.factory;

import com.zz.abstractfactory.product.ingredient.*;

/**
 * @Author zhangzhen
 * @create 2022/11/19 16:44
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Pepperoni createPepperoni();

    Clams createClams();

}
