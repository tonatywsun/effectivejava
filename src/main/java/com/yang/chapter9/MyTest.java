package com.yang.chapter9;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/12 16:09
 */
public class MyTest {
    /**
     * 如果finally里出现了异常则会覆盖try中的异常，这在现实的系统中会导致调试变得非常复杂，
     * 因为通常需要看到第一个异常才能诊断出问题何在
     *
     * @author : tona.sun
     * @date : 2020/5/12 16:12
     */
    @Test
    public void test1() throws IOException {
        InputStream inputStream = new FileInputStream("src");
        try {
            OutputStream outputStream = new FileOutputStream("src");
            try {

            } finally {
                outputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /**
     * try-with-resources则会抛出多个异常
     */
    @Test
    public void test2() throws Exception {
        try (MyAutoCloseable myAutoCloseable = new MyAutoCloseable(); MyAutoCloseable myAutoCloseable2 = new MyAutoCloseable()) {
            System.out.println(myAutoCloseable);
            System.out.println(myAutoCloseable2);
            throw new Exception("test2");
        }
    }
}
