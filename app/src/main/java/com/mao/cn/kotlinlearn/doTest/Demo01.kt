package com.mao.cn.kotlinlearn.doTest

import java.util.*

/**
 * Created by zhangkun on 2017/5/23.
 */

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {

    var a = 1
    var s1 = "a is $a"

    a = 2

    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
    println(s2)

    println("  maxof  " + maxof(2, 3))
    println(" maxOf01   " + maxOf01(2, 3))

    //-----------------------

    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    //-----------------------

    fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLength(obj) ?: " .... err,not a string"} ")
    }

    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))

    //-------------

    listFor()

    listFor01()

    //-----------

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    //-----
    ranges()
    inRanges()

    //-----------

    println(addVararg(2, 5, 2, 4, 5, 5))
    arrayFun()
    arrayNull()
}

fun maxof(a: Int, b: Int): Int {

    if (a > b) {

        readLine()
        return a
    } else {
        return b
    }
}


fun maxOf01(a: Int, b: Int) = if (a > b) a else b

//------------------------------

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(str1: String, str2: String) {
    val x = parseInt(str1)
    val y = parseInt(str2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println(" either  '$str1' or '$str2' is not a number")
    }
}

//------------------------------

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength01(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length
}


fun getStringLength02(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

//----------------------------

fun listFor() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println("数据是 " + item)
    }
}

fun listFor01() {
    val items = listOf("apple", "banana", "kiwi")

    for (index in items.indices) {
        println("数据是 " + items[index])
    }

    val itemTemp = mutableListOf<String>()
    itemTemp.add("text1")
    itemTemp.add("text2")
    itemTemp.add("text3")

    itemTemp.forEach { println(it) }
}


//----------------------------

fun describe(obj: Any): String =
        when (obj) {
            1 -> "one"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "not a string"
            else -> "Unknown"
        }


//----------------------------

fun ranges() {

    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in the ranges")
    }
}

//----------------------------- 遍历

fun inRanges() {
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too" + list.indices)
    }
}

//------------------------ vararg 多个同一类型的参数

fun addVararg(a: Int, b: Int, vararg n: Int): Int {
    var sum = a + b
    for (i in n) {
        sum += i
    }

    return sum
}

fun <T> singletonList(item: T): List<T> = listOf(item)

//-------------------------数组cd

fun arrayFun() {
    val a = arrayOf("hello", "world")
    for (temp in a) {
        println(" temp " + temp)
    }
}

fun arrayNull() {
    val emptyArray1: Array<String?> = emptyArray()
    val emptyArray2: Array<String?> = arrayOfNulls(0)
    println(Arrays.equals(emptyArray1, emptyArray2))


    val emptyArray3: Array<String?> = arrayOf("test2", "test2")

    println(emptyArray3.iterator())


    val squares = Array<Int>(5, { it -> (it + 1) * (it + 1) })

    for (square in squares) {

        println("  square "+square)
    }


    squares.forEach { i: Int -> println("  测试  "+i) }

    squares.forEach { println(it) }
}
