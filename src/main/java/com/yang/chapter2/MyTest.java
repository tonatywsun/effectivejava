package com.yang.chapter2;

import com.alibaba.fastjson.JSONObject;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/09 15:48
 */
 class MyTest {
     public static void main(String[] args) {
        Entry1 build = Entry1.builder().attribute1("1").attribute2("2").build();
        //没有get方法 fastjson获取不到字段
        System.out.println(JSONObject.toJSONString(build));
        System.out.println(build);
    }
}
