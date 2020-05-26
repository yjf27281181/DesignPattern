package edu.csu.factory.abstractfactory2.fatory;

import edu.csu.factory.abstractfactory2.store.food.Food;
import edu.csu.factory.abstractfactory2.store.food.Hamburger;
import edu.csu.factory.abstractfactory2.store.phone.Android;
import edu.csu.factory.abstractfactory2.store.phone.Phone;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class PlanBFactory implements PlanFactory {
    @Override
    public Phone createPhone() {
        return new Android();
    }

    @Override
    public Food createFood() {
        return new Hamburger();
    }
}
