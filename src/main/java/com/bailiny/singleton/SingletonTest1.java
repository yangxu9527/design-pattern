package com.bailiny.singleton;

/**
 * 懒汉式-静态常量
 */
public class SingletonTest1 {

    private static SingletonTest1 instance = new SingletonTest1();

    private SingletonTest1() {

    }

    public static SingletonTest1  getInstance() {
        return instance;
    }
}
