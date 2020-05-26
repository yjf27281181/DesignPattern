package edu.csu.iterator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yanjuefei
 * @date 2020/5/21 0021
 * @Description
 */
public class MyArrayList<T> implements MyCollection<T> {
    Object[] arr;

    int idx = 0;

    public MyArrayList() {
        this.arr = new Object[10];

    }

    @Override
    public void add(T element) {
        arr[idx] = element;
        idx++;
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyIterator<T> {
        int cur = 0;
        @Override
        public boolean hasNext() {
            return cur < idx;
        }

        @Override
        public T next() {

            return (T)arr[cur++];
        }
    }
}
