package edu.csu.observer.v4;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public class Dog implements Observer {
    @Override
    public void handleCry(WakeUpEvent wakeUpEvent) {
        if(wakeUpEvent.timestamp<5000) {
            System.out.println("dog wang wang wang!");
        }

    }
}
