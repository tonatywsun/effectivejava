package com.yang.chapter6;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/12 14:04
 */
 class MyTest {
     public static void main(String[] args) {
        //"true".equalsIgnoreCase(s)?TURE:FALSE;
        Boolean.valueOf("true");
        Integer.valueOf("1");

        Map map = new HashMap();
        map.put("", "");
        //即使后面map中的数据变了，entrySet也会随之变，不需要重复获取
        Set set = map.entrySet();
    }
    //要优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱
    @Test
     void sum() {
        long l = System.currentTimeMillis();
        Long sum = 0L;
        //程序构造了大约Integer.MAX_VALUE个多余的Long实例(大约每次往Long sum中增加long时构造一个实例)。
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - l);
        System.out.println("==========================");
        l = System.currentTimeMillis();
        long sum1 = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
        System.out.println(System.currentTimeMillis() - l);
    }
}
