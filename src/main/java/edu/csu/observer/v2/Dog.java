package edu.csu.observer.v2;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public class Dog implements Observer{
    @Override
    public void handleCry() {
        System.out.println("dog wang wang wang!");
    }
}
