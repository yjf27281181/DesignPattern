package edu.csu.strategy;

/**
 * @author yanjuefei
 * @date 2020/5/15 0015
 * @Description
 */
public class Cat {
    public int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat other) {
        return this.weight*this.height - other.weight*other.height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
