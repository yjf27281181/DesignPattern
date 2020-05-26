package edu.csu.factory.abstractfactory2.fatory;

import edu.csu.factory.abstractfactory2.store.food.Food;

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
