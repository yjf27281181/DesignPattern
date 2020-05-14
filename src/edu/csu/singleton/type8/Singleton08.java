package edu.csu.singleton.type8;

/**
 * @author yanjuefei
 * @date 2020/5/13 0013
 * @Description
 */
public class Singleton08 {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE == Singleton.INSTANCE);
    }
}
enum Singleton {
    /**
     * 实例
     */
    INSTANCE;
    public void sayOK() {
        System.out.println("ok");
    }
}