package com.mao.cn.kotlinlearn.abstractInterface.impl

import com.mao.cn.kotlinlearn.abstractInterface.KotlinInterface

/**
 * Created by zhangkun on 2017/6/5.
 */
class KotlinInferfaceImpl : KotlinInterface {
    override var prop: Int = 0

    override fun foo(prop: Int) {
        println("prop " + prop)
    }


}