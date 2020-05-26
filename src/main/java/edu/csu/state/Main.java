package edu.csu.state;

/**
 * @author yanjuefei
 * @date 2020/5/25 0025
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person(new PersonHappyState());
        p.exec();

        p = new Person(new PersonSadState());
        p.exec();
    }
}
