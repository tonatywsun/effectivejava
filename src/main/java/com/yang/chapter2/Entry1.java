package com.yang.chapter2;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/09 15:42
 */
 class Entry1 {
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;

    private Entry1(Builder builder) {
        attribute1 = builder.attribute1;
        attribute2 = builder.attribute2;
        attribute3 = builder.attribute3;
        attribute4 = builder.attribute4;
        attribute5 = builder.attribute5;
        attribute6 = builder.attribute6;
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

     static Builder builder() {
        return new Builder();
    }

     static class Builder {
        private String attribute1;
        private String attribute2;
        private String attribute3;
        private String attribute4;
        private String attribute5;
        private String attribute6;

         Builder attribute1(String attribute1) {
            this.attribute1 = attribute1;
            return this;
        }

         Builder attribute2(String attribute2) {
            this.attribute2 = attribute2;
            return this;
        }

         Builder attribute3(String attribute3) {
            this.attribute3 = attribute3;
            return this;
        }

         Builder attribute4(String attribute4) {
            this.attribute4 = attribute4;
            return this;
        }

         Builder attribute5(String attribute5) {
            this.attribute5 = attribute5;
            return this;
        }

         Builder attribute6(String attribute6) {
            this.attribute6 = attribute6;
            return this;
        }

         Entry1 build() {
            return new Entry1(this);
        }
    }
}
