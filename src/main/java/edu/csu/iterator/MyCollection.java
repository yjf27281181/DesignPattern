package edu.csu.iterator;

/**
 * @author yanjuefei
 * @date 2020/5/21 0021
 * @Description
 */
public interface MyCollection<T> {
    void add(T element);
    MyIterator<T> iterator();
}
