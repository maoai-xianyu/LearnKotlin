package com.mao.cn.edwardLearn

/**
 * author:  zhangkun .
 * date:    on 2018/5/30.
 */

@Deprecated(SUBSYSTEM_DEPRECATED)
class Kp21Person(val name: String, var age: Int) {

    init {
        println(CREETING_CONSTANT)
    }

    override fun toString(): String {
        return "Kp18Person(name='$name', age=$age)"
    }

}
