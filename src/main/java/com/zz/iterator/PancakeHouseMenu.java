package com.zz.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author zhangzhen
 * @create 2023/2/4 20:57
 */
public class PancakeHouseMenu implements Menu<MenuItem> {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49);
        addItem("Waffles", "Waffles, with your choice of buleberries or strawberries",
                true, 3.59);
    }

    public void addItem(String name, String description, boolean vagetarian, double price) {
        menuItems.add(MenuItem.of(name, description, vagetarian, price));
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

}
