package com.mao.cn.kotlinlearn.K01FunDoTest.bean

/**
 * Created by zhangkun on 2017/6/2.
 *
 *
 *
 */
open class DogP(name:String) : DogG(name){
    override var age = 0
    override fun say() = "I am DogP named $name,$age years old"

    final override fun speak() = "I am DogP named $name,$age years old"
}