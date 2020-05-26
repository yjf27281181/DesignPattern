package edu.csu.observer.v3;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public interface Observer {
    void handleCry(WakeUpEvent wakeUpEvent);
}
