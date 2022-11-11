package com.zz.observer.subscriber;

import com.zz.observer.publisher.Observer;

/**
 * @Author zhangzhen
 * @create 2022/11/11 21:18
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removerObserver(Observer observer);

    void notifyObservers();

}
