package edu.csu.proxy.v2;

import java.util.Random;

/**
 * @author yanjuefei
 * @date 2020/5/19 0019
 * @Description
 */
public class Tank implements Moveable {

    @Override
    public void move() {
        System.out.println("tank is moving");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
