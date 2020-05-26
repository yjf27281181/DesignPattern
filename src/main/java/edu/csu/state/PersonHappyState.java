package edu.csu.state;

/**
 * @author yanjuefei
 * @date 2020/5/25 0025
 * @Description
 */
public class PersonHappyState extends PersonState {
    @Override
    void say() {
        System.out.println("高兴地说");
    }

    @Override
    void cry() {
        System.out.println("高兴地哭（什么鬼）");
    }

    @Override
    void smile() {
        System.out.println("高兴地微笑");
    }
}
