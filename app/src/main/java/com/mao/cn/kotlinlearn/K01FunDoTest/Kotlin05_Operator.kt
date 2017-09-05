package com.mao.cn.kotlinlearn.K01FunDoTest

/**
 * author:  zhangkun .
 * date:    on 2017/9/5.
 */
fun main(args: Array<String>) {
    stringFunPlus()
}

/**
 * 所有重载了运算符的函数都要用 operator 关键字标记。
 * 比如，Kotlin 中规定 + 号应该重载为 plus() 函数，所有基础类型都重载这个函数，执行 a + b 实际就是执行 a.plus(b)，
 * 对于 Int.plus() 函数，它执行的就是加法，
 * 对于 String.plus() 函数，它执行的就是字符串连接。
 */
fun stringFunPlus(){
    val s = "hello"
    println(s.plus("world!"))
    println(s.plus(""))
}