package edu.csu.proxy.v1;

/**
 * @author yanjuefei
 * @date 2020/5/19 0019
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        TankProxy tankProxy = new TankProxy(tank);
        tankProxy.move();
    }
}

