package edu.csu.observer.v3;

import edu.csu.observer.v3.Child;
import edu.csu.observer.v3.Dad;
import edu.csu.observer.v3.Dog;
import edu.csu.observer.v3.Mom;

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
