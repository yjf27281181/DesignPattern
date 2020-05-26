package edu.csu.decorator;

/**
 * @author yanjuefei
 * @date 2020/5/16 0016
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        NPC npc = new NPC();
        Character character = new Character();

        new BloodDecorator(npc).draw();
        System.out.println("----------");
        new BloodDecorator(character).draw();
    }
}
