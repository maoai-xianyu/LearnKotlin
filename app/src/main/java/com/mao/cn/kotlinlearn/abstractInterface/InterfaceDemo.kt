package com.mao.cn.kotlinlearn.abstractInterface

import com.mao.cn.kotlinlearn.abstractInterface.impl.KotlinInferfaceImpl

/**
 * Created by zhangkun on 2017/6/5.
 */
fun main(args: Array<String>){

    val inter = KotlinInferfaceImpl()
    inter.prop = 100
    println(" ----  "+inter.prop)
    inter.foo(1000)
    inter.bar()
}