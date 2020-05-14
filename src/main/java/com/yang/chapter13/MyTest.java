package com.yang.chapter13;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/14 17:39
 */
 class MyTest {
     public static void main(String[] args) {
        MyEntry[] entries = new MyEntry[]{new MyEntry(), new MyEntry(), new MyEntry()};
        System.out.println(entries);
        MyEntry[] clone = entries.clone();
        entries[0].setMyEntry2(new MyEntry2());
        System.out.println(clone);
        System.out.println(clone[0].getMyEntry2());
        System.out.println(entries[0] == clone[0]);

        int[] arr = new int[]{0, 1, 2};
        int[] cloneArr = arr.clone();
    }
}
