package edu.csu.factory.abstractfactory2.fatory;

import edu.csu.factory.abstractfactory2.store.food.Food;
import edu.csu.factory.abstractfactory2.store.phone.Phone;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public interface PlanFactory {

    Phone createPhone();

    Food createFood();
}
