package com.bailiny.singleton;

/**
 * 懒汉式-静态常量
 * 缺点是可能造成内存的浪费
 */
public class SingletonTest1 {

    private final static SingletonTest1 instance = new SingletonTest1();

    private SingletonTest1() {

    }

    public static SingletonTest1  getInstance() {
        return instance;
    }
}
