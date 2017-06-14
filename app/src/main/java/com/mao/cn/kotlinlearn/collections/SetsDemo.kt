package com.mao.cn.kotlinlearn.collections

import java.util.*

/**
 * Created by zhangkun on 2017/6/7.
 */
fun main(args: Array<String>) {

    setofFun()

    mutableSetOfFun()

    hashSetOfFun()

    linkedSetOfFun()

    sortedSetOfFun()
}


fun setofFun() {
    val set = emptySet<String>()

    println(set?.size ?: "empty")

    val setSingle = Collections.singleton("empty")

    println(setSingle.any())
    println(setSingle.isEmpty())
    println(setSingle.iterator())

    setSingle.forEach {
        println(it)
    }

    val setsof = setOf("mesds", "mesds", "asdasdas", "asdasdasd")

    setsof.forEach {
        println(it)
    }

}

fun mutableSetOfFun() {

    val s = mutableSetOf<String>()

    s.add("asdasdas")
    s.add("mesds")
    s.add("asdadas")
    s.add("aasdas")

    s.forEach {
        println(it)
    }
}

fun hashSetOfFun() {
    println("------------ hashSetOfFun ")

    val s = hashSetOf<String>()

    s.add("asdasdas")
    s.add("mesds")
    s.add("asdadas")
    s.add("aasdas")

    s.forEach {
        println(it)
    }
}


fun linkedSetOfFun() {

    println("------------ linkedSetOfFun ")

    val s = linkedSetOf<String>()

    s.add("asdasdas")
    s.add("mesds")
    s.add("asdadas")
    s.add("basdas")

    s.forEach {
        println(it)
    }
}


fun sortedSetOfFun() {

    println("------------ sortedSetOfFun ")

    val s = sortedSetOf<String>()

    s.add("asdasdas")
    s.add("mesds")
    s.add("asdadas")
    s.add("basdas")

    s.forEach {
        println(it)
    }
}


