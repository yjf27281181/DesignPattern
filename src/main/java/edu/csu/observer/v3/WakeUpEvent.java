package edu.csu.observer.v3;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public class WakeUpEvent {
    long timestamp;
    String msg;

    public WakeUpEvent(long timestamp, String msg) {
        this.timestamp = timestamp;
        this.msg = msg;
    }
}
