package com.zz.adapter;

/**
 * @Author zhangzhen
 * @create 2022/12/10 18:02
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
