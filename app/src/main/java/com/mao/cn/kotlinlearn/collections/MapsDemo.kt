package com.mao.cn.kotlinlearn.collections

/**
 * author:  zhangkun .
 * date:    on 2017/6/22.
 */
fun main(args: Array<String>) {
    pairFun()

}

fun pairFun() {


    val p1: Pair<String, Int> = "hello" to 1

    println(" p1.first  " + p1.first)
    println(" p1.second  " + p1.second)
    println(" p1.first  " + p1.copy())


    val array = intArrayOf(1, 2, 3)
//    val list = listOf(0, *array, 4, 5)


}

