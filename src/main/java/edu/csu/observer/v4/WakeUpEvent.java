package edu.csu.observer.v4;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
public class WakeUpEvent {
    long timestamp;
    String msg;
    Child source;

    public WakeUpEvent(long timestamp, String msg, Child source) {
        this.timestamp = timestamp;
        this.msg = msg;
        this.source = source;
    }
}
