package com.mao.cn.java;

/**
 * author:  zhangkun .
 * date:    on 2018/3/22.
 */

public class OverridableImpl implements Defaulable {
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}
