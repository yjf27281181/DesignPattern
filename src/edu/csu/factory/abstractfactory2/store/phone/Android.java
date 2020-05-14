package edu.csu.factory.abstractfactory2.store.phone;

/**
 * @author yanjuefei
 * @date 2020/5/14 0014
 * @Description
 */
public class Android implements Phone {
    @Override
    public void call() {
        System.out.println("I am android");
    }
}
