package edu.csu.proxy.v1;

/**
 * @author yanjuefei
 * @date 2020/5/19 0019
 * @Description
 */
public class TankProxy implements Moveable {

    private Tank tank;

    public TankProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();

        System.out.println("running time: "+(end - start));
    }
}
