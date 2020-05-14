package com.yang.chapter1;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/09 15:06
 */
 class MyTest {
     public static void main(String[] args) {
        Entry1 entry1 = Entry1.allAttrEntry();
        System.out.println(entry1);
        System.out.println(new Entry1("", "", "", "", "", ""));

        //general
        //类型转换
        Date.from(Instant.ofEpochMilli(1));
        //聚合方法，带有多个参数，返回该类型的一个实例，把它们合并起来
        //Set<Entry1> faceCards = EnumSet.of(传枚举);
        //比from和of更烦琐的一种替代方法
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
    }
}
