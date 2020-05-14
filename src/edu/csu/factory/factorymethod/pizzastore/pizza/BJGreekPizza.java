package edu.csu.factory.factorymethod.pizzastore.pizza;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class BJGreekPizza extends Pizza{
    public BJGreekPizza() {
        setName("bj cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.println("prepare " + getName() +" pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake " + getName() +" pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut " + getName() +" pizza");
    }

    @Override
    public void box() {
        System.out.println("box " + getName() +" pizza");
    }
}
