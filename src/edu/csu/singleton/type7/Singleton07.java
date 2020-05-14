package edu.csu.singleton.type7;

/**
 * @author yanjuefei
 * @date 2020/5/13 0013
 * @Description
 */
public class Singleton07 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}

class Singleton {
    /**
     * 防止外部new
     */
    private Singleton() {

    }

    /**
     * 写一个静态内部类，内部类有个静态属性singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 对外提供拿到instance的接口
     * @return
     */
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}