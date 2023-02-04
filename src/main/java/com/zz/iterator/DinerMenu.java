package com.zz.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author zhangzhen
 * @create 2023/2/4 21:08
 */
public class DinerMenu implements Menu<MenuItem> {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("BLT", "Bacon with lettuce & tomato on whole wheat",
                false, 2.99);
        addItem("Soup of the day", "Soup of the day, with the side of potato salad",
                false, 3.29);
    }

    public void addItem(String name, String description, boolean vagetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = MenuItem.of(name, description, vagetarian, price);
            numberOfItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator<>(menuItems);
    }

}
