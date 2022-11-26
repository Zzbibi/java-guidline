package com.zz.command;

/**
 * @Author zhangzhen
 * @create 2022/11/26 16:17
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
