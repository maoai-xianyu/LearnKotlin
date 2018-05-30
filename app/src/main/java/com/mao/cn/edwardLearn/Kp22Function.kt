package com.mao.cn.edwardLearn

/**
 * author:  zhangkun .
 * date:    on 2018/5/30.
 */
fun main(args: Array<String>) {

    println(sum(3, 5, "this is result = "))

}

fun sum(a: Int, b: Int, lazy: String): String {
    return "$lazy ${a + b}"
}

fun sum1(a: Int, b: Int, lazy: String) = "$lazy ${a + b}"
