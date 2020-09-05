package com.bailiny.singleton;

/**
 * 饿汉式-静态常量
 */
public class SingletonTest2 {

    private static SingletonTest2 instance;

    static {
        instance = new SingletonTest2();
    }

    private SingletonTest2() {

    }

    public static SingletonTest2 getInstance() {
        return instance;
    }
}
