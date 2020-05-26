package edu.csu.observer.v1;

/**
 * @author yanjuefei
 * @date 2020/5/17 0017
 * @Description
 */
class Child {
    private boolean cry = false;
    private Dad d = new Dad();

    public void wakeUp() {
        cry = true;
        d.feed();
    }
}
