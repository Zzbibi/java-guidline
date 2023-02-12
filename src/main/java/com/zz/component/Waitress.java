package com.zz.component;

import java.util.Iterator;

/**
 * @Author zhangzhen
 * @create 2023/2/5 11:13
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVagetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("Vagetarian menu ------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVagetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                //
            }
        }
    }

}
