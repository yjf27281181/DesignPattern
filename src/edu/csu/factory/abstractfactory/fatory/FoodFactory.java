package edu.csu.factory.abstractfactory.fatory;

import edu.csu.factory.abstractfactory.store.food.Food;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public abstract class FoodFactory {
    /**
     * 制造食物
     * @return
     */
    public abstract Food createFood();
}
