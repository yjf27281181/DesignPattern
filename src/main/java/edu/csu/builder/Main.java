package edu.csu.builder;

/**
 * @author yanjuefei
 * @date 2020/5/23 0023
 * @Description
 */
public class Main {



    public static void main(String[] args) {
        ComplexBuilder complexBuilder = new ComplexBuilder();
        complexBuilder.buildPart1().buildPart2().buildPart3();
        System.out.println(complexBuilder.build());
    }
}

class ComplexBuilder {
    String content = "";

    ComplexBuilder buildPart1() {
        content += "built part1,";
        return this;
    }

    ComplexBuilder buildPart2() {
        content += "built part2,";
        return this;
    }

    ComplexBuilder buildPart3() {
        content += "built part3,";
        return this;
    }

    String build() {
        return content;
    }
}
