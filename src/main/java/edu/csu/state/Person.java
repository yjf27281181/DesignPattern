package edu.csu.state;

/**
 * @author yanjuefei
 * @date 2020/5/25 0025
 * @Description
 */
public class Person {

    PersonState personState;

    public Person(PersonState personState) {
        this.personState = personState;
    }

    public void exec() {
        personState.cry();
        personState.say();
        personState.smile();
    }
}
