package com.bailiny.factory.simplefactory.order;

import com.bailiny.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yang Xu
 * @date 2020/9/7 11:46
 * @description:
 */
public class OrderPizza {

    SimpleFactory simpleFactory;

    Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory) {
        // 用户输入的披萨类型
        String orderType = "";
        // 设置简单工厂对象
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     *
     * @return
     */
    private String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = br.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
