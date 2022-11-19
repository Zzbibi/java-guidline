package com.zz.factorymethod.pizza;

/**
 * @Author zhangzhen
 * @create 2022/11/19 16:31
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Chess Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Chess");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
