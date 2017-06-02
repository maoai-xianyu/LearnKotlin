package com.mao.cn.kotlinlearn.doTest.bean

/**
 * Created by zhangkun on 2017/6/1.
 * Kotlin 强制要求类内定义的非抽象属性都要初始化，
 * 但是有些属性不需要在新建实例时初始化，或可能需要外部注入来初始化，
 * 这些时候我们都无法按照 Kotlin 的要求初始化属性。为了避免编译错误，可以使用 lateinit 关键字修饰属性。
 */

class StuDetail(val name:String){

    lateinit var hello :String
    fun initHello(){
        hello = "hello,my name is $name"
    }

}