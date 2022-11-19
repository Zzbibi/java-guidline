package com.zz.factorymethod.pizza;

/**
 * @Author zhangzhen
 * @create 2022/11/19 16:28
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY style sauce and Chess pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Chess");
    }

}
