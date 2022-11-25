package com.zz.singlon;

/**
 * @Author zhangzhen
 * @create 2022/11/25 22:04
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {}

    // 延迟加载，双重检查加锁
//    public static Singleton getSingleton() {
//        if (null == singleton) {
//            synchronized (Singleton.class) {
//                if (null == singleton) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    // 直接加载，静态内部类
    private static class SingletonHolder {

        private static final Singleton instance = new Singleton();

    }

    public static Singleton getSingleton() {
        return SingletonHolder.instance;
    }

}
