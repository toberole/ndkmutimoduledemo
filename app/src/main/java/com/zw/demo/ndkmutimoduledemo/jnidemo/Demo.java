package com.zw.demo.ndkmutimoduledemo.jnidemo;

public class Demo {
    public native static int add(int a,int b);


    static {
        System.loadLibrary("moudle_one");
    }
}
