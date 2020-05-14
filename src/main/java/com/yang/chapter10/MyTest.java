package com.yang.chapter10;

import java.util.Objects;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/13 16:15
 */
public class MyTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Objects.equals(new MyTest(),null);
        //google autovalue框架测试 下面两行代码可以运行 但是看着不好看 先注释了
        //AutoValueTest a1=new AutoValue_AutoValueTest();
        //AutoValueTest a2=new AutoValue_AutoValueTest();
        //System.out.println(a1.equals(a2));
    }
}
