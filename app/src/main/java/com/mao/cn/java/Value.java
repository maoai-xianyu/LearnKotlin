package com.mao.cn.java;

/**
 * author:  zhangkun .
 * date:    on 2018/3/23.
 */

public class Value<T> {
    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return (value != null) ? value : defaultValue;
    }
}
