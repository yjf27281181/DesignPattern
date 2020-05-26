package edu.csu.proxy.v3;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yanjuefei
 * @date 2020/5/19 0019
 * @Description
 */
public class TimeMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("in cglib proxy");

        return methodProxy.invokeSuper(o, objects);
    }
}
