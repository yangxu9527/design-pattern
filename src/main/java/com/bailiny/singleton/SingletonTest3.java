package com.bailiny.singleton;

/**
 * 懒汉式-线程不安全
 */
public class SingletonTest3 {

    private static SingletonTest3 instance;

    private SingletonTest3() {

    }

    public static SingletonTest3 getInstance() {
        if (instance == null) {
            return new SingletonTest3();
        }
        return instance;
    }
}
