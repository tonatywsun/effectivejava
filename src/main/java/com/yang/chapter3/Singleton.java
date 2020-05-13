package com.yang.chapter3;

/**
 * @Description: 枚举单例
 * 枚举可以实现接口，但不能继承
 * 如果Singleton必须扩展一个超类，而不是扩展Enum的时候，则不宜使用这个方法（虽然可以声明枚举去实现接口）
 * @Author: tona.sun
 * @Date: 2020/05/12 11:00
 */
public enum Singleton implements OneInterface{
    INSTANCE;
    Singleton() {
    }

    public void doSomething() {
    }

    @Override
    public void method() {

    }
}
