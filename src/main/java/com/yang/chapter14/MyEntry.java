package com.yang.chapter14;

import java.util.Comparator;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/14 17:53
 */
 class MyEntry implements Comparable {
    private Integer age;
    private Integer age2;
    private Integer age3;

     MyEntry(Integer age, Integer age2, Integer age3) {
        this.age = age;
        this.age2 = age2;
        this.age3 = age3;
    }

     static final Comparator<MyEntry> COMPARATOR =
            Comparator.comparingInt((MyEntry myentry) -> myentry.age).thenComparingInt(myentry -> myentry.age2).thenComparingInt(myentry -> myentry.age3);

    @Override
    public int compareTo(Object o) {
        MyEntry myEntry = (MyEntry) o;
        //Integer.compare(this.age,myEntry.age);
        return COMPARATOR.compare(this, myEntry);
    }
}
