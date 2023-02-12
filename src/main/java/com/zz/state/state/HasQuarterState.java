package com.zz.state.state;

import com.zz.state.GumballMachine;

import java.util.Random;

/**
 * @Author zhangzhen
 * @create 2023/2/12 15:04
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;
    private Random random;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int nonce = random.nextInt(10);
        if (0 == nonce && gumballMachine.getCount() != 0) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}
