package edu.csu.factory.abstractfactory.fatory;

import edu.csu.factory.abstractfactory.store.food.CheesePizza;
import edu.csu.factory.abstractfactory.store.food.Food;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class PizzaFactory extends FoodFactory {
    @Override
    public Food createFood() {
        return new CheesePizza();
    }
}
