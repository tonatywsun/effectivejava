package com.yang.chapter1;

/**
 * @Description: 一个正常的实体类
 * @Author: tona.sun
 * @Date: 2020/05/09 14:52
 */
public class Entry1 {
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private static Entry1 entry1 = new Entry1();

    /**
     * 使用静态工厂。这里面我想返回什么返回什么有好处也有劣处，返回预先定义好的对象也行，返回单例也行，还可以给方法起名称
     */
    public static Entry1 allAttrEntry() {
        return new Child();
        //return entry1;
        //return new Entry1("", "", "", "", "", "");
        //return new Entry1();
    }

    public Entry1(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public Entry1() {
    }

    @Override
    public String toString() {
        return "Entry1{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                '}';
    }
}
