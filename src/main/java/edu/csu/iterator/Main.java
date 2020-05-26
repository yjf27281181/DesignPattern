package edu.csu.iterator;

/**
 * @author yanjuefei
 * @date 2020/5/21 0021
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        MyIterator<Integer> iterator = myArrayList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
