package edu.csu.state;

/**
 * @author yanjuefei
 * @date 2020/5/25 0025
 * @Description
 */
public class PersonSadState extends PersonState {
    @Override
    void say() {
        System.out.println("悲伤地说");
    }

    @Override
    void cry() {
        System.out.println("悲伤地哭");
    }

    @Override
    void smile() {
        System.out.println("悲伤地笑");
    }
}
