package com.zz.command;

/**
 * @Author zhangzhen
 * @create 2022/11/26 16:19
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
