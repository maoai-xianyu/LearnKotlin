package com.mao.cn.java;

/**
 * author:  zhangkun .
 * date:    on 2018/3/22.
 */

public interface Defaulable {
    default String notRequired() {
        return "Default implementation";
    }
}
