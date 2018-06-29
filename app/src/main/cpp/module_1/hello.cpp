//
// Created by Apple on 2018/6/29.
//
#include "com_zw_demo_ndkmutimoduledemo_jnidemo_Demo.h"

JNIEXPORT jint JNICALL Java_com_zw_demo_ndkmutimoduledemo_jnidemo_Demo_add
        (JNIEnv *env, jclass jclazz, jint ja, jint jb){
    return ja+jb;
}

int add(int a,int b){
    return a+b;
}
