package edu.csu.factory.abstractfactory2.fatory;

import edu.csu.factory.abstractfactory2.store.food.Food;
import edu.csu.factory.abstractfactory2.store.food.Hamburger;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class HamburgerFactory extends FoodFactory {
    @Override
    public Food createFood() {
        System.out.println("making hamburger");
        return new Hamburger();
    }
}
