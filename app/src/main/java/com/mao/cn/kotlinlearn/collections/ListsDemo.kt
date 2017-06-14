package com.mao.cn.kotlinlearn.collections

import com.mao.cn.kotlinlearn.doTest.singletonList

/**
 * Created by zhangkun on 2017/6/7.
 */
fun main(args: Array<String>) {
    listFun()
    mutableListFun()
    listOfNotNullFun()
}


fun listFun() {

    val listEmpty = emptyList<String>()

    println(listEmpty?.size ?: "empty")

    val listSingle = singletonList("text")

    println(message = listSingle[0])


    val string = arrayOf("TE3","TE54","TE1","TE5","TE7")

    val list = listOf(*string)

    list.forEach {
        println(it)
    }

}

fun mutableListFun(){

    val list = mutableListOf<String>()
    list.add("测试")
    list.add("list")
    list.add("测试list")
    list.add("测试")

    list.forEach {
        println(it)
    }
}

fun listOfNotNullFun(){

    val list = listOfNotNull("","s",null,"ddssda",null)
    list.forEach {

        println("  ces  "+it)
    }

}