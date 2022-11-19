package com.zz.factorymethod.pizza;

import java.util.ArrayList;

/**
 * @Author zhangzhen
 * @create 2022/11/19 16:08
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: " + toppings);
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza int official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
