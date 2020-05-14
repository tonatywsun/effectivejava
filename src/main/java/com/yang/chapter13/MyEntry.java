package com.yang.chapter13;

/**
 * @Description: 对象拷贝的更好的办法是提供一个拷贝构造器或拷贝工厂。这条规则最绝对的例外是数组，最好利用clone方法复制数组。
 * @Author: tona.sun
 * @Date: 2020/05/14 17:32
 */
 class MyEntry implements Cloneable {
    private /*final*/ MyEntry2 myEntry2;

     MyEntry() {
    }

     MyEntry(MyEntry2 myEntry2) {
        this.myEntry2 = myEntry2;
    }

    /**
     * 拷贝构造器
     */
     MyEntry(MyEntry myEntry) {
        this.myEntry2 = myEntry.getMyEntry2();
    }

    /**
     * 拷贝工厂
     */
     static MyEntry newInstance(MyEntry myEntry) {
        return new MyEntry(myEntry);
    }

     MyEntry2 getMyEntry2() {
        return myEntry2;
    }

     void setMyEntry2(MyEntry2 myEntry2) {
        this.myEntry2 = myEntry2;
    }

    @Override
    protected MyEntry clone() {
        MyEntry clone = null;
        try {
            clone = (MyEntry) super.clone();
            clone.myEntry2 = this.myEntry2.clone();
        } catch (CloneNotSupportedException exception) {

        }
        return clone;
    }

}
