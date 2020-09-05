package com.bailiny.singleton;

/**
 * 懒汉式-线程安全
 * 缺点，效率低下，每次获取实例时都需要同步，不推荐使用
 */
public class SingletonTest4 {

    private static SingletonTest4 instance;

    private SingletonTest4() {

    }

    public static synchronized SingletonTest4 getInstance() {
        if (instance == null) {
            return new SingletonTest4();
        }
        return instance;
    }
}
