package edu.csu.factory.abstractfactory2.fatory;

import edu.csu.factory.abstractfactory2.store.food.CheesePizza;
import edu.csu.factory.abstractfactory2.store.food.Food;
import edu.csu.factory.abstractfactory2.store.phone.IPhone;
import edu.csu.factory.abstractfactory2.store.phone.Phone;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class PlanAFactory implements PlanFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Food createFood() {
        return new CheesePizza();
    }
}
