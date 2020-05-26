package edu.csu.singleton.type2;

/**
 * @author yanjuefei
 * @date 2020/5/13 0013
 * @Description
 */
public class Singleton02 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
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
    private final static Singleton instance;

    static {
        //在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    /**
     * 对外提供拿到instance的接口
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
