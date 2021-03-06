package edu.csu.observer.v3;

import edu.csu.observer.v3.Observer;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public class Mom  implements Observer {
    public void hug() {
        System.out.println("Mom hug hug hug");
    }

    @Override
    public void handleCry(WakeUpEvent wakeUpEvent) {
        hug();
    }
}
