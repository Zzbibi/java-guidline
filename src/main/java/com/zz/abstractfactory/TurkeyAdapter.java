package com.zz.abstractfactory;

import com.zz.adapter.Duck;
import com.zz.adapter.Turkey;

import java.util.function.Supplier;

/**
 * @Author zhangzhen
 * @create 2022/12/10 18:04
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public TurkeyAdapter(Supplier<Turkey> supplier) {
        this.turkey = supplier.get();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

}
