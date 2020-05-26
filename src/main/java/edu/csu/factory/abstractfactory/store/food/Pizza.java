package edu.csu.factory.abstractfactory.store.food;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */

public abstract class Pizza implements Food {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

}
