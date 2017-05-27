package com.mao.cn.kotlinlearn.doTest.bean

/**
 * Created by zhangkun on 2017/5/26.
 */
class Stu(name: String) {
    var name = name
        set(value) {
            field = if (value.isEmpty()) " " else value[0].toUpperCase() + value.substring(1)
        }

    val isValidName
        get() = !name.isEmpty()
}