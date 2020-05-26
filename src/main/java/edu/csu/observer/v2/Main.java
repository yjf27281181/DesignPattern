package edu.csu.observer.v2;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.addObserver(new Dad());
        child.addObserver(new Mom());
        child.addObserver(new Dog());
        child.wakeUp();
    }
}
