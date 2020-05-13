package com.yang.chapter9;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/12 16:18
 */
public class MyAutoCloseable implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close");
        throw new Exception("close");
    }
}
