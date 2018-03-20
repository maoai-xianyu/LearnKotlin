package com.mao.cn.kotlinlearn.K07Collection.mutableCollection.mapListSet

/**
 * Created by zhangkun on 2017/6/7.
 */


fun main(args: Array<String>) {

    mapFun()

    listFun()

}

fun mapFun() {

    val map: Map<Int, Number> = mapOf(1 to 2.3, 2 to 3.5)
    println("  map " + map[1] + " map get " + map.get(1))
    println("  map  ${map[1]}  map get ${map.get(1)}")
    println(message = "  map  ${map[1]}  map get ${map.get(1)}")

    val entries = map.entries

    for ((key, value) in entries) {
        println(" key " + key)
        println(" value" + value)
    }

    entries.forEach {
        println(" key " + it.key)
        println(" value" + it.value)
    }

    map.map { println(it) }

}


//---------------------
fun listFun() {

    val list: List<String> = listOf("text", "text2", "text4")

    list.forEach { println(it) }

}