package com.zz.state.state;

/**
 * @Author zhangzhen
 * @create 2023/2/12 14:40
 */
public interface State {

    /**
     * 投入硬币
     */
    void insertQuarter();

    /**
     * 退回硬币
     */
    void ejectQuarter();

    /**
     * 拨动开关
     */
    void turnCrank();

    /**
     * 发送糖果
     */
    void dispense();

}
