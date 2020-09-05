package com.bailiny.singleton;

/**
 * 双重检查
 * 推荐使用，注意变量加上volatile。
 * 解决了线程安全和懒加载的问题
 */
public class SingletonTest5 {

    private static volatile SingletonTest5 instance;

    private SingletonTest5() {

    }

    public static synchronized SingletonTest5 getInstance() {
        if (instance == null) {
            synchronized (SingletonTest5.class) {
                if (instance == null) {
                    return new SingletonTest5();
                }
            }
        }
        return instance;
    }
}
