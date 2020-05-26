package edu.csu.decorator;

/**
 * @author yanjuefei
 * @date 2020/5/16 0016
 * @Description
 */
public class Character implements GameObject{

    @Override
    public void draw() {
        System.out.println("画出了角色");
    }
}
