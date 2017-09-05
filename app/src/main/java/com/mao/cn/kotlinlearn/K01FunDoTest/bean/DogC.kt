package com.mao.cn.kotlinlearn.K01FunDoTest.bean

/**
 * Created by zhangkun on 2017/6/2.
 *
 *
 *
 */
open class DogC(name: String) : DogP(name) {
    override var age = 0
    override fun say() = "I am DogC named $name,$age years old"
}