package com.mao.cn.java;

/**
 * author:  zhangkun .
 * date:    on 2018/3/22.
 */
@FunctionalInterface
public interface Functional {

    void method();

    default void defaultMethod() {
        System.out.println("默认方法");
    }
}
