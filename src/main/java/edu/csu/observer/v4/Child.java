package edu.csu.observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
class Child {
    private boolean cry = false;
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void wakeUp() {
        cry = true;
        for(Observer ob: observerList) {
            ob.handleCry(new WakeUpEvent(10000, "hungry", this));
        }
    }
}
