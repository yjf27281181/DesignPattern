package edu.csu.singleton.type1;

/**
 * @author yanjuefei
 * @date 2020/5/13 0013
 * @Description
 */
public class Singleton01 {
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
    private final static Singleton instance = new Singleton();

    /**
     * 对外提供拿到instance的接口
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
