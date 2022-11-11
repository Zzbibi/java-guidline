package com.zz.observer.publisher;

/**
 * @Author zhangzhen
 * @create 2022/11/11 21:16
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
