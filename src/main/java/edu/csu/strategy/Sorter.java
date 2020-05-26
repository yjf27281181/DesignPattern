package edu.csu.strategy;

import java.util.Arrays;

/**
 * @author yanjuefei
 * @date 2020/5/15 0015
 * @Description
 */
public class Sorter<T> {

    public void sort(T[] arr, MyComparator<T> comparator) {
        if (arr == null || arr.length <= 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            T temp = arr[i];
            int flag = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[j], temp) < 0 ) {
                    temp = arr[j];
                    flag = j;
                }
            }
            if (flag != i) {
                arr[flag] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
