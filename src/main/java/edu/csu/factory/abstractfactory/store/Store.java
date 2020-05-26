package edu.csu.factory.abstractfactory.store;

import edu.csu.factory.abstractfactory.fatory.HamburgerFactory;
import edu.csu.factory.abstractfactory.store.food.Food;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class Store {
    public static void main(String[] args) {
        Food food =(new HamburgerFactory()).createFood();

    }
}
