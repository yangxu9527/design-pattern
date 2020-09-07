package com.bailiny.factory.simplefactory.order;

import com.bailiny.factory.simplefactory.pizza.Pizza;

/**
 * @author Yang Xu
 * @date 2020/9/7 11:33
 * @description: 披萨店，相当于一个客户端
 */
public class PizzaStroe {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Pizza greekPizza = factory.createPizza("greek");
        greekPizza.prepare();
        greekPizza.bake();
        greekPizza.cut();
        greekPizza.box();
    }
}
