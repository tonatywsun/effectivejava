package com.yang.chapter14;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/14 18:22
 */
class MyTest {
    public static void main(String[] args) {
        MyEntry myEntry = new MyEntry(1, 2, 3);
        MyEntry myEntry1 = new MyEntry(1, 3, 3);
        System.out.println(myEntry.compareTo(myEntry1));
    }
}
