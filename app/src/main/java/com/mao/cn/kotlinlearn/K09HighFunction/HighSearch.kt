package com.mao.cn.kotlinlearn.K09HighFunction

/**
 * author:  zhangkun .
 * date:    on 2018/4/10.
 */

fun main(array: Array<String>) {
    println(searchFun())
}


fun searchFun(): Int {

    val array = intArrayOf(1, 5, 3)

    return array.findLast { it % 2 == 1 } ?: -1
}
