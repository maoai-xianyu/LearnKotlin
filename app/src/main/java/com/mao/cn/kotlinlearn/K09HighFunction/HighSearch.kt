package com.mao.cn.kotlinlearn.K09HighFunction

/**
 * author:  zhangkun .
 * date:    on 2018/4/10.
 */

fun main(array: Array<String>) {
    println(searchFun())
    println("--------------------------")


    var array = intArrayOf()
    println("null " + searchFirstOrNullFun(array))

    array = intArrayOf(1, 2, 4, 5, 6)
    println("not null " + searchFirstOrNullFun(array))

    println("--------------------------")

    maxByFun();

}


fun searchFun(): Int {

    val array = intArrayOf(1, 5, 3)

    return array.findLast { it % 2 == 1 } ?: -1
}

fun searchFirstOrNullFun(array: IntArray): Int {

    return array.firstOrNull { it % 2 == 1 } ?: -1
}


fun maxByFun() {
    val stu = arrayOf(
            Stu("sada", 12),
            Stu("dfasdfs", 56),
            Stu("asd", 33)
    )

    val oldest = stu.maxBy { it.age }!!
    println("Oldest one is ${oldest.name}")
}
