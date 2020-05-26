package edu.csu.templatemethod;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * @author yanjuefei
 * @date 2020/5/24 0024
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Worker tiredWorker = new TiredWorker();
        tiredWorker.exec();

        Worker happyWorker = new HappyWorker();
        happyWorker.exec();
    }
}

abstract class Worker {
    abstract void chooseWork();
    abstract void work();

    public void exec() {
        chooseWork();
        work();
    }
}

class TiredWorker extends Worker {

    @Override
    void chooseWork() {
        System.out.println("I choose 996");
    }

    @Override
    void work() {
        System.out.println("I am tired");
    }
}

class HappyWorker extends Worker {

    @Override
    void chooseWork() {
        System.out.println("I choose 955");
    }

    @Override
    void work() {
        System.out.println("I am happy");
    }
}
