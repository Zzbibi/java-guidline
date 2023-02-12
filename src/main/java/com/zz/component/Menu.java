package com.zz.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author zhangzhen
 * @create 2023/2/5 11:03
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
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
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator<>(menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.print("\n" + getName() + ", " + getDescription());
        System.out.println("---------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

}
