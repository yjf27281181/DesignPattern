package edu.csu.proxy.v3;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author yanjuefei
 * @date 2020/5/19 0019
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}
