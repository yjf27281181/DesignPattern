package edu.csu.observer.v4;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding");
    }

    @Override
    public void handleCry(WakeUpEvent wakeUpEvent) {
        if("hungry".equals(wakeUpEvent.msg)) {
            feed();
        }
    }
}
