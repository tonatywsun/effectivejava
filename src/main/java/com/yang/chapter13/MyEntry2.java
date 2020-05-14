package com.yang.chapter13;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/14 17:33
 */
public class MyEntry2 implements Cloneable{
    @Override
    protected MyEntry2 clone() throws CloneNotSupportedException {
        return (MyEntry2)super.clone();
    }
}
