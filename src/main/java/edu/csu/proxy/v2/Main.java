package edu.csu.proxy.v2;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yanjuefei
 * @date 2020/5/19 0019
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        final Tank tank = new Tank();
        Moveable m = (Moveable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Moveable.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("in proxy");
                        Object o = method.invoke(tank, args);
                        return o;
                    }
                });
        m.move();

    }
}

