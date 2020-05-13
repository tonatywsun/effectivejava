package com.yang.chapter3;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    @Test
    public void test1() throws Exception {
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println("singleton1---" + singleton1);
        File file = new File("D://a.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(singleton1);
        // 读出来
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Singleton1 readObject = (Singleton1) objectInputStream.readObject();
        System.out.println("readObject---" + readObject);
    }
}
