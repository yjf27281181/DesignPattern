package edu.csu.singleton.type6;

/**
 * @author yanjuefei
 * @date 2020/5/13 0013
 * @Description
 */
public class Singleton06 {
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
     * 内部创建对象实例
     */
    private static volatile Singleton instance;

    static {
        //在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    /**
     * 对外提供拿到instance的接口
     * @return
     */
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}