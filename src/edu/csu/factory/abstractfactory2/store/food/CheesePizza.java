package edu.csu.factory.abstractfactory2.store.food;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        setName("cheese pizza");
    }

    @Override
    public void prepare() {
        System.out.println("prepare" + getName() +" pizza");
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
