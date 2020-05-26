package edu.csu.strategy;

import java.util.Arrays;

/**
 * @author yanjuefei
 * @date 2020/5/15 0015
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat(1,1), new Cat(5,5),new Cat(3,3)};
        Sorter<Cat> sorter = new Sorter<Cat>();
        sorter.sort(cats, (c1, c2)-> c1.weight - c2.weight);
        System.out.println(Arrays.toString(cats));
    }
}
