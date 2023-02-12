package com.zz.state.state;

import com.zz.state.GumballMachine;

/**
 * @Author zhangzhen
 * @create 2023/2/12 15:03
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, out of gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, out of gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, out of gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, out of gumballs");
    }

}
