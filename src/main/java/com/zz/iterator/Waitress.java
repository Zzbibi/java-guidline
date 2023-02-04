package com.zz.iterator;

import java.util.Iterator;

/**
 * @Author zhangzhen
 * @create 2023/2/4 21:39
 */
public class Waitress {

    private Menu<MenuItem> pancakeHouseMenu;
    private Menu<MenuItem> dinerMenu;

    public Waitress(Menu<MenuItem> pancakeHouseMenu, Menu<MenuItem> dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("---- Menu BreakFast ----");
        printMenu(pancakeIterator);

        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("---- Menu Launch ----");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
    }

}
