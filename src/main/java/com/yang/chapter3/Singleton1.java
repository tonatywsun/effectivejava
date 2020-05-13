package com.yang.chapter3;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/12 11:33
 */
public class Singleton1 implements Serializable {
    private static Singleton1 SINGLETON;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (SINGLETON == null) {
            synchronized (Singleton1.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton1();
                }
            }
        }
        return SINGLETON;
    }

    /**
     * 反序列化的时候也会执行这个方法，不然会生成新的对象
     */
    private Object readResolve() {
        System.out.println("readResolve");
        return SINGLETON;
    }
}
