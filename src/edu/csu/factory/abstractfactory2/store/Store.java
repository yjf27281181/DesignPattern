package edu.csu.factory.abstractfactory2.store;

import edu.csu.factory.abstractfactory2.fatory.HamburgerFactory;
import edu.csu.factory.abstractfactory2.fatory.PlanAFactory;
import edu.csu.factory.abstractfactory2.fatory.PlanFactory;
import edu.csu.factory.abstractfactory2.store.food.Food;
import edu.csu.factory.abstractfactory2.store.phone.Phone;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 *
 */
public class Store {
    public static void main(String[] args) {
        PlanFactory factory = new PlanAFactory();
        Food food =factory.createFood();
        Phone phone =factory.createPhone();
        phone.call();
    }
}
