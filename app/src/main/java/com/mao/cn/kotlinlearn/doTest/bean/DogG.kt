package com.mao.cn.kotlinlearn.doTest.bean

/**
 * Created by zhangkun on 2017/6/2.
 * open 关键字在 Kotlin 中可以用在定义 非抽象的类、类函数和类属性 之前，用来将它们标记为 可继承 的
 *
 *
 */
open class DogG(val name:String){
    open var age = 0
    open fun say() = "My name is $name,$age years old"

    open fun speak() = "My name is $name,$age years old"
}