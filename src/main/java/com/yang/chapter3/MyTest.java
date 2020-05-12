package com.yang.chapter3;

import java.lang.reflect.Constructor;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/12 11:05
 */
public class MyTest {
    public static void main(String[] args) throws Exception {
        Constructor<?>[] constructors = Class.forName("com.yang.chapter3.Singleton").getDeclaredConstructors();
        //设置构造函数为可进入的 不然privte不能创建对象
        constructors[0].setAccessible(true);
        //这里可以看到枚举即使是通过反射也无法创建对象
       /* if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            throw new IllegalArgumentException("Cannot reflectively create enum objects");*/
        Object o = constructors[0].newInstance();
    }
}
