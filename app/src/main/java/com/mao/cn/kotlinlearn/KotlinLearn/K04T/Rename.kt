package com.mao.cn.kotlinlearn.KotlinLearn.K04T

/**
 * Created by Ming on 2017/9/12.
 */
fun main(args: Array<String>) {
    val array = arrayOf("hello", "world")
    array.map {
        println(it)
    }
    array.map(::println)

}