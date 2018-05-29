package com.mao.cn.edwardLearn

/**
 * author:  zhangkun .
 * date:    on 2018/5/29.
 *
 * ?.  if(str == null) null else str.toUpperCase
 */
fun main(args: Array<String>) {


    nullSafetyPartOne()
    println("-------------------------------")
    nullSafetyPartTwo()
}


/**
 * ？ 和 ?:
 */
fun nullSafetyPartOne() {
    val str: String? = null

    println(str?.toUpperCase())

    val stu = Stu("jack", 12)


    val streetName = stu.address?.street?.name
    println("街道名字 $streetName")

    println("-------------------------------")

    val str1 = if (str != null) {
        str
    } else {
        "this is default"
    }
    println("str1 $str1")
    // 转换
    val str2 = str ?: "this is default"
    println("str2 $str2")
}

/**
 * 安全类型转换操作符 as?
 *
 * 非空断言操作符 !! 这个必须保证数据不为空，否则npe
 *
 */

fun nullSafetyPartTwo() {


    val someThing: Any = arrayOf(1, 2, 3, 4)
    val str2 = someThing as? String
    println(str2)

    println("-------------------------------")
    val str: String? = "hello word"
    if (str == null) {
        throw Exception()
    } else {
        str.toUpperCase()
    }
    println(str)

    val strTemp: String? = null
    // 转换
    // 转换报错在当前行
   /* val str1: String = strTemp!!.toUpperCase()
    println(str1)*/

    // 报错发送在赋值的地方
    val str1: String = strTemp!!
    val str3 = str1.toUpperCase()
    println(str3)

}