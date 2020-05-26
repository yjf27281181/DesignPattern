package edu.csu.decorator;

/**
 * @author yanjuefei
 * @date 2020/5/16 0016
 * @Description
 */
public class BloodDecorator implements GameObject{
    GameObject gameObject;

    public BloodDecorator(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public void draw() {
        this.gameObject.draw();
        System.out.println("画了一个血条");
    }
}
