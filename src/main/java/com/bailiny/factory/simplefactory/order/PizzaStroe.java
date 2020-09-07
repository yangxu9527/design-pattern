package com.bailiny.factory.simplefactory.order;

/**
 * @author Yang Xu
 * @date 2020/9/7 11:33
 * @description: 披萨店，相当于一个客户端
 */
public class PizzaStroe {

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
