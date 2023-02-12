package com.zz.iterator;

import com.zz.component.MenuComponent;
import com.zz.component.NullIterator;

import java.util.Iterator;

/**
 * @Author zhangzhen
 * @create 2023/2/4 21:00
 */
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vagetarian;
    private double price;

    public MenuItem(String name, String description, boolean vagetarian, double price) {
        this.name = name;
        this.description = description;
        this.vagetarian = vagetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVagetarian() {
        return vagetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public static MenuItem of(String name, String description, boolean vagetarian, double price) {
        return new MenuItem(name, description, vagetarian, price);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator<>();
    }

    public void print() {
        System.out.println(getName() + ", " + getPrice() + " -- " + getDescription());
    }

}
