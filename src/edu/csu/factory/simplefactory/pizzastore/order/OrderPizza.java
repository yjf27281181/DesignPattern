package edu.csu.factory.simplefactory.pizzastore.order;

import edu.csu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class OrderPizza {
    SimpleFactory factory = null ;
    Pizza pizza = null;
    
    
    public void setFactory(SimpleFactory factory) {
        String orderType = "";
        /**
         * 设置工厂对象
         */
        this.factory = factory;

        while(true) {
            orderType = getType();
            pizza = this.factory.createPizza(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有该类型");
                break;
            }
        }
    }

    private String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type is : ");
        String type = null;
        try {
            type = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
