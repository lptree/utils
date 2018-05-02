package com.lptree.utils.Test;

public class TestInerface {
    public static void main(String[] args) {
        final int externalInt = 1;
        int result = new IMyInterface() {
            public int Do() {
                return externalInt;
            }
        }.Do();
    }

    public int getWoman() {
        class Woman {
            int age = 0;
        }
        return new Woman().age;
    }
}


interface IMyInterface {
    int Do();
}

