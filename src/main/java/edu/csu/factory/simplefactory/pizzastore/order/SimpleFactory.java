package edu.csu.factory.simplefactory.pizzastore.order;

import edu.csu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import edu.csu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import edu.csu.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class SimpleFactory {
    /**
     * 根据type返回对应的对象
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        System.out.println("简单工厂模式");

        Pizza pizza = null;

        if("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if("cheese".equals(type)) {
            pizza = new CheesePizza();
        }

        return pizza;
    }
}
