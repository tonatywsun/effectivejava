package com.yang.chapter14;

import java.util.Comparator;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/14 17:53
 */
public class MyEntry implements Comparable {
    private Integer age;
    private Integer age2;
    private Integer age3;
    public static final Comparator<MyEntry> COMPARATOR =
            Comparator.comparingInt((MyEntry myentry) -> myentry.age).thenComparingInt(myentry -> myentry.age2).thenComparingInt(myentry -> myentry.age3);

    @Override
    public int compareTo(Object o) {
        MyEntry myEntry = (MyEntry) o;
        return COMPARATOR.compare(this, myEntry);
    }
}
