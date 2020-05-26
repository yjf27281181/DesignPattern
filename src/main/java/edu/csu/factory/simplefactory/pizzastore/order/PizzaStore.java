package edu.csu.factory.simplefactory.pizzastore.order;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setFactory(new SimpleFactory());
    }
}
